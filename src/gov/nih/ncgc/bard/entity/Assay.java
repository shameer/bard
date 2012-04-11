package gov.nih.ncgc.bard.entity;

import java.sql.Date;
import java.util.List;

/**
 * A representation of an assay.
 *
 * @author Rajarshi Guha
 */
public class Assay implements BardEntity {
    Long aid;
    int category, type, summary, assays, classification, samples;
    String name, description, source, grantNo;
    Date deposited, updated;

    List<Publication> publications;
    List<ProteinTarget> targets;
    List<AssayData> data;

    public Assay(Long aid, int category, int type, int summary, int assays, int classification, int samples, String name, String description, String source, String grantNo, Date deposited, Date updated) {
        this.aid = aid;
        this.category = category;
        this.type = type;
        this.summary = summary;
        this.assays = assays;
        this.classification = classification;
        this.samples = samples;
        this.name = name;
        this.description = description;
        this.source = source;
        this.grantNo = grantNo;
        this.deposited = deposited;
        this.updated = updated;
    }

    public String toString() {
        return aid + "[" + name + "]";
    }

    public Assay() {
    }

    public int getAssays() {
        return assays;
    }

    public void setAssays(int assays) {
        this.assays = assays;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public int getSamples() {
        return samples;
    }

    public void setSamples(int samples) {
        this.samples = samples;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<AssayData> getData() {
        return data;
    }

    public void setData(List<AssayData> data) {
        this.data = data;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public List<ProteinTarget> getTargets() {
        return targets;
    }

    public void setTargets(List<ProteinTarget> targets) {
        this.targets = targets;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSummary() {
        return summary;
    }

    public void setSummary(Integer summary) {
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGrantNo() {
        return grantNo;
    }

    public void setGrantNo(String grantNo) {
        this.grantNo = grantNo;
    }

    public Date getDeposited() {
        return deposited;
    }

    public void setDeposited(Date deposited) {
        this.deposited = deposited;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
