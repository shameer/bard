//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.14 at 01:23:56 PM EST 
//


package gov.nih.ncgc.bard.capextract.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element ref="{}contexts" minOccurs="0"/>
 *         &lt;element name="experimentMeasures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}experimentMeasure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}link" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="experimentId" use="required" type="{}bardID" />
 *       &lt;attribute name="holdUntilDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="runDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="runDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Pending"/>
 *             &lt;enumeration value="Approved"/>
 *             &lt;enumeration value="Rejected"/>
 *             &lt;enumeration value="Revised"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute ref="{}readyForExtraction use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "experimentName",
    "description",
    "contexts",
    "experimentMeasures",
    "link"
})
@XmlRootElement(name = "experiment")
public class Experiment {

    @XmlElement(required = true)
    protected String experimentName;
    @XmlElement(nillable = true)
    protected String description;
    protected Contexts contexts;
    protected Experiment.ExperimentMeasures experimentMeasures;
    @XmlElement(required = true)
    protected List<Link> link;
    @XmlAttribute(name = "experimentId", required = true)
    protected BigInteger experimentId;
    @XmlAttribute(name = "holdUntilDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdUntilDate;
    @XmlAttribute(name = "runDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDateFrom;
    @XmlAttribute(name = "runDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDateTo;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "readyForExtraction", required = true)
    protected String readyForExtraction;

    /**
     * Gets the value of the experimentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * Sets the value of the experimentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentName(String value) {
        this.experimentName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contexts property.
     * 
     * @return
     *     possible object is
     *     {@link Contexts }
     *     
     */
    public Contexts getContexts() {
        return contexts;
    }

    /**
     * Sets the value of the contexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contexts }
     *     
     */
    public void setContexts(Contexts value) {
        this.contexts = value;
    }

    /**
     * Gets the value of the experimentMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link Experiment.ExperimentMeasures }
     *     
     */
    public Experiment.ExperimentMeasures getExperimentMeasures() {
        return experimentMeasures;
    }

    /**
     * Sets the value of the experimentMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Experiment.ExperimentMeasures }
     *     
     */
    public void setExperimentMeasures(Experiment.ExperimentMeasures value) {
        this.experimentMeasures = value;
    }

    /**
     * Link to self
     * Link to results
     * Link to Project and Assay Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the experimentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExperimentId() {
        return experimentId;
    }

    /**
     * Sets the value of the experimentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExperimentId(BigInteger value) {
        this.experimentId = value;
    }

    /**
     * Gets the value of the holdUntilDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldUntilDate() {
        return holdUntilDate;
    }

    /**
     * Sets the value of the holdUntilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldUntilDate(XMLGregorianCalendar value) {
        this.holdUntilDate = value;
    }

    /**
     * Gets the value of the runDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDateFrom() {
        return runDateFrom;
    }

    /**
     * Sets the value of the runDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDateFrom(XMLGregorianCalendar value) {
        this.runDateFrom = value;
    }

    /**
     * Gets the value of the runDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDateTo() {
        return runDateTo;
    }

    /**
     * Sets the value of the runDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDateTo(XMLGregorianCalendar value) {
        this.runDateTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the readyForExtraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyForExtraction() {
        return readyForExtraction;
    }

    /**
     * Sets the value of the readyForExtraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyForExtraction(String value) {
        this.readyForExtraction = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}experimentMeasure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "experimentMeasure"
    })
    public static class ExperimentMeasures {

        @XmlElement(required = true)
        protected List<ExperimentMeasure> experimentMeasure;

        /**
         * Gets the value of the experimentMeasure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentMeasure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExperimentMeasure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExperimentMeasure }
         * 
         * 
         */
        public List<ExperimentMeasure> getExperimentMeasure() {
            if (experimentMeasure == null) {
                experimentMeasure = new ArrayList<ExperimentMeasure>();
            }
            return this.experimentMeasure;
        }

    }

}
