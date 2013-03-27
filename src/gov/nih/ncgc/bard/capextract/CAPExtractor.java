package gov.nih.ncgc.bard.capextract;

//import gov.nih.ncgc.bard.capextract.handler.AssayHandler;
//import gov.nih.ncgc.bard.capextract.handler.AssaysHandler;

import gov.nih.ncgc.bard.capextract.handler.AssayHandler;
import gov.nih.ncgc.bard.capextract.handler.AssaysHandler;
import gov.nih.ncgc.bard.capextract.handler.BardexportHandler;
import gov.nih.ncgc.bard.capextract.handler.DictionaryHandler;
import gov.nih.ncgc.bard.capextract.handler.ExperimentHandler;
import gov.nih.ncgc.bard.capextract.handler.ExperimentResultHandler;
import gov.nih.ncgc.bard.capextract.handler.ExperimentsHandler;
import gov.nih.ncgc.bard.capextract.handler.ExternalReferenceHandler;
import gov.nih.ncgc.bard.capextract.handler.ExternalSystemHandler;
import gov.nih.ncgc.bard.capextract.handler.ProjectDocHandler;
import gov.nih.ncgc.bard.capextract.handler.ProjectHandler;
import gov.nih.ncgc.bard.capextract.handler.ProjectsHandler;
import gov.nih.ncgc.bard.capextract.handler.ResultHandler;
import gov.nih.ncgc.bard.capextract.jaxb.Link;
import gov.nih.ncgc.bard.capextract.jaxb.Projects;

import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example code to play with the Broad CAP Data Export API.
 * <p/>
 * CAP data export API defined at <a href="https://github.com/broadinstitute/BARD/wiki/BARD-Data-Export-API">
 * https://github.com/broadinstitute/BARD/wiki/BARD-Data-Export-API</a>. This class is primarily a driver
 * and all the details of individual entities coming from the CAP are processed by individual handlers
 * (such as {@link ProjectHandler}, {@link AssayHandler}, etc.). Depending on the nature of the entity, a
 * handler may handle just the entity and invoke a different handler for its child entities, or else may
 * choose to handle all the child entities.
 *
 * @author Rajarshi Guha
 * @see CapResourceHandlerRegistry
 * @see DictionaryHandler
 * @see BardexportHandler
 * @see AssayHandler
 * @see AssaysHandler
 * @see ProjectHandler
 * @see ProjectsHandler
 */
public class CAPExtractor {
    private CapResourceHandlerRegistry registry;

    public <T> int getRelatedCount(Vector<T> vec) {
        int count = 0;
        if (vec == null) return count;
        for (T t : vec) {
            try {
                Method getLinkList = t.getClass().getMethod("getLink", (Class<?>[]) null);
                @SuppressWarnings("unchecked")
                List<Link> links = (List<Link>) getLinkList.invoke(t, (Object[]) null);
                for (Link link : links)
                    if (link.getRel().equals("related"))
                        count++;
            } catch (Exception e) {
                ;
            }
        }
        return count;
    }

    public void run() throws IOException, NoSuchAlgorithmException {
        registry.getHandler(CAPConstants.CapResource.BARDEXPORT).process(CAPConstants.CAP_ROOT, CAPConstants.CapResource.BARDEXPORT);
    }

    public void poll() throws IOException {
        Logger log = LoggerFactory.getLogger(this.getClass());

        Vector<Projects> projects = registry.getHandler(CAPConstants.CapResource.PROJECTS).
                poll(CAPConstants.CAP_ROOT + "/projects", CAPConstants.CapResource.PROJECTS);
        log.info("Project count: " + projects.get(0).getCount().toString());

        // each project is obtained via a link
        for (Projects aProjects : projects) {
            List<Link> projectLinks = aProjects.getLink();
            for (Link projectLink : projectLinks) {
                CAPConstants.CapResource res = CAPConstants.getResource(projectLink.getType());
                if (res == CAPConstants.CapResource.PROJECT) {
                    ICapResourceHandler handler = CapResourceHandlerRegistry.getInstance().getHandler(res);
                    handler.process(projectLink.getHref(), res);
                }
            }
        }
    }

    public void setHandlers() {
        registry = CapResourceHandlerRegistry.getInstance();
        registry.setHandler(CAPConstants.CapResource.PROJECTS, new ProjectsHandler());
        registry.setHandler(CAPConstants.CapResource.PROJECT, new ProjectHandler());
        registry.setHandler(CAPConstants.CapResource.PROJECTDOC, new ProjectDocHandler());
        registry.setHandler(CAPConstants.CapResource.ASSAYS, new AssaysHandler());
        registry.setHandler(CAPConstants.CapResource.ASSAY, new AssayHandler());
        registry.setHandler(CAPConstants.CapResource.EXPERIMENTS, new ExperimentsHandler());
        registry.setHandler(CAPConstants.CapResource.EXPERIMENT, new ExperimentHandler());
        registry.setHandler(CAPConstants.CapResource.RESULT, new ResultHandler());
        registry.setHandler(CAPConstants.CapResource.BARDEXPORT, new BardexportHandler());
        registry.setHandler(CAPConstants.CapResource.DICTIONARY, new DictionaryHandler());
        registry.setHandler(CAPConstants.CapResource.EXTREF, new ExternalReferenceHandler());
        registry.setHandler(CAPConstants.CapResource.EXTSYS, new ExternalSystemHandler());
        registry.setHandler(CAPConstants.CapResource.RESULT_JSON, new ExperimentResultHandler());

        //        registry.setHandler(CAPConstants.CapResource.RESULTS, new ResultsHandler());
    }


    public static void main(String[] args) throws Exception {
        CAPExtractor c = new CAPExtractor();

        // before running the extractor, lets set our handlers
        c.setHandlers();

        // let's just peek at what's available
//        c.poll();

        // lets start pulling
        c.run();

//        c.test();
    }


}
