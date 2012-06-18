package gov.nih.ncgc.bard.rest;

import chemaxon.formats.MolImporter;
import chemaxon.struc.Molecule;
import gov.nih.ncgc.bard.entity.Compound;
import gov.nih.ncgc.bard.tools.DBUtils;
import gov.nih.ncgc.bard.tools.Util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Prototype of MLBD REST resources.
 * <p/>
 * This is mainly to explore the use of Jersey for presenting REST
 * services for the MLBD
 *
 * @author Rajarshi Guha
 */
@Path("/v1/substances")
public class BARDSubstanceResource implements IBARDResource {

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    static final String VERSION = "1.0";

    @Context
    ServletContext servletContext;
    @Context
    HttpServletRequest httpServletRequest;
    @Context
    HttpHeaders headers;

    @GET
    @Produces("text/plain")
    @Path("/_info")
    public String info() {
        StringBuilder msg = new StringBuilder("Returns substance information\n\nAvailable resources:\n");
        List<String> paths = Util.getResourcePaths(this.getClass());
        for (String path : paths) msg.append(path).append("\n");
        return msg.toString();
    }

    /**
     * Return a count of (possibly filtered) instances of a given resource.
     *
     * @param filter A query filter or null
     * @return the number of instances
     */
    @GET
    @Produces("text/plain")
    @Path("/_count")
    public String count(@QueryParam("filter") String filter) {
        DBUtils db = new DBUtils();
        try {
            int n = db.getSubstanceCount();
            db.closeConnection();
            return String.valueOf(n);
        } catch (SQLException e) {
            throw new WebApplicationException(e, 500);
        }
    }

    public Response getResources(@QueryParam("filter") String filter,
                                 @QueryParam("expand") String expand,
                                 @QueryParam("skip") Integer skip,
                                 @QueryParam("top") Integer top) {
        return getResources(null, filter, expand);
    }

    private Response getCompoundResponse(String id, String type, List<MediaType> mediaTypes) throws SQLException, IOException {
        if (!type.equals("cid") && !type.equals("sid")) throw new WebApplicationException(400);

        DBUtils db = new DBUtils();
        Compound c = null;
        if (type.equals("cid")) {
            List<Long> sids = db.getSidsByCid(Long.parseLong(id));
            List<String> paths = new ArrayList<String>();
            for (Long sid : sids) paths.add(BARDConstants.API_BASE + "/substances/" + sid);
            return Response.ok(Util.toJson(paths), MediaType.APPLICATION_JSON).build();
        } else if (type.equals("sid"))
            c = db.getCompoundBySid(Long.parseLong(id));   // TODO should be returning a Substance entity, not a compound entity
        db.closeConnection();

        if (c == null || c.getCid() == null) throw new WebApplicationException(404);

        if (mediaTypes.contains(BARDConstants.MIME_SMILES)) {
            String smiles = c.getSmiles() + "\t" + id;
            return Response.ok(smiles, BARDConstants.MIME_SMILES).build();
        } else if (mediaTypes.contains(BARDConstants.MIME_SDF)) {
            Molecule mol = MolImporter.importMol(c.getSmiles());
            mol.setProperty("cid", String.valueOf(c.getCid()));
            mol.setProperty("probeId", c.getProbeId());
            mol.setProperty("url", c.getUrl());
            mol.setProperty("resourecePath", c.getResourcePath());
            String sdf = mol.exportToFormat("sdf");
            return Response.ok(sdf, BARDConstants.MIME_SDF).build();
        } else {
            String json = c.toJson();
            return Response.ok(json, MediaType.APPLICATION_JSON).build();
        }
    }

    // return compound (via CID) for this SID
    @GET
    @Path("/{sid}")
    public Response getResources(@PathParam("sid") String resourceId, @QueryParam("filter") String filter, @QueryParam("expand") String expand) {
        try {
            return getCompoundResponse(resourceId, "sid", headers.getAcceptableMediaTypes());
        } catch (SQLException e) {
            throw new WebApplicationException(e, 500);
        } catch (IOException e) {
            throw new WebApplicationException(e, 500);
        }
    }

    // return list of SID's for this CID
    @GET
    @Path("/cid/{cid}")
    public Response getCompoundBySid(@PathParam("cid") String resourceId, @QueryParam("filter") String filter, @QueryParam("expand") String expand) {
        try {
            return getCompoundResponse(resourceId, "cid", headers.getAcceptableMediaTypes());
        } catch (SQLException e) {
            throw new WebApplicationException(e, 500);
        } catch (IOException e) {
            throw new WebApplicationException(e, 500);
        }
    }

}