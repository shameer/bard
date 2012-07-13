//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.12 at 12:28:08 PM EDT 
//


package gov.nih.ncgc.bard.capextract.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element ref="{}resultContextItems" minOccurs="0"/>
 *         &lt;element name="projectExperiments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="projectExperiment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}description" minOccurs="0"/>
 *                             &lt;element name="precedingExperiment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{}link"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" use="required" type="{}bardID" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="externalReference" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="externalAssayRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="externalSystem">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="systemUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="experimentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="holdUntilDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="runDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="runDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="experimentId" type="{}bardID" />
 *       &lt;attribute ref="{}readyForExtraction"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "resultContextItems",
    "projectExperiments",
    "externalReferences",
    "link"
})
@XmlRootElement(name = "experiment")
public class Experiment {

    @XmlElement(nillable = true)
    protected String description;
    protected ResultContextItems resultContextItems;
    protected Experiment.ProjectExperiments projectExperiments;
    protected Experiment.ExternalReferences externalReferences;
    protected List<Link> link;
    @XmlAttribute(name = "experimentName", required = true)
    protected String experimentName;
    @XmlAttribute(name = "holdUntilDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdUntilDate;
    @XmlAttribute(name = "runDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDateFrom;
    @XmlAttribute(name = "runDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDateTo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "experimentId")
    protected BigInteger experimentId;
    @XmlAttribute(name = "readyForExtraction")
    protected String readyForExtraction;

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
     * Gets the value of the resultContextItems property.
     * 
     * @return
     *     possible object is
     *     {@link ResultContextItems }
     *     
     */
    public ResultContextItems getResultContextItems() {
        return resultContextItems;
    }

    /**
     * Sets the value of the resultContextItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultContextItems }
     *     
     */
    public void setResultContextItems(ResultContextItems value) {
        this.resultContextItems = value;
    }

    /**
     * Gets the value of the projectExperiments property.
     * 
     * @return
     *     possible object is
     *     {@link Experiment.ProjectExperiments }
     *     
     */
    public Experiment.ProjectExperiments getProjectExperiments() {
        return projectExperiments;
    }

    /**
     * Sets the value of the projectExperiments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Experiment.ProjectExperiments }
     *     
     */
    public void setProjectExperiments(Experiment.ProjectExperiments value) {
        this.projectExperiments = value;
    }

    /**
     * Gets the value of the externalReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Experiment.ExternalReferences }
     *     
     */
    public Experiment.ExternalReferences getExternalReferences() {
        return externalReferences;
    }

    /**
     * Sets the value of the externalReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Experiment.ExternalReferences }
     *     
     */
    public void setExternalReferences(Experiment.ExternalReferences value) {
        this.externalReferences = value;
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
     *         &lt;element name="externalReference" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="externalAssayRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="externalSystem">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="systemUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "externalReference"
    })
    public static class ExternalReferences {

        @XmlElement(required = true)
        protected List<Experiment.ExternalReferences.ExternalReference> externalReference;

        /**
         * Gets the value of the externalReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Experiment.ExternalReferences.ExternalReference }
         * 
         * 
         */
        public List<Experiment.ExternalReferences.ExternalReference> getExternalReference() {
            if (externalReference == null) {
                externalReference = new ArrayList<Experiment.ExternalReferences.ExternalReference>();
            }
            return this.externalReference;
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
         *         &lt;element name="externalAssayRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="externalSystem">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="systemUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
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
            "externalAssayRef",
            "externalSystem",
            "link"
        })
        public static class ExternalReference {

            @XmlElement(required = true)
            protected String externalAssayRef;
            @XmlElement(required = true)
            protected Experiment.ExternalReferences.ExternalReference.ExternalSystem externalSystem;
            protected List<Link> link;

            /**
             * Gets the value of the externalAssayRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExternalAssayRef() {
                return externalAssayRef;
            }

            /**
             * Sets the value of the externalAssayRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExternalAssayRef(String value) {
                this.externalAssayRef = value;
            }

            /**
             * Gets the value of the externalSystem property.
             * 
             * @return
             *     possible object is
             *     {@link Experiment.ExternalReferences.ExternalReference.ExternalSystem }
             *     
             */
            public Experiment.ExternalReferences.ExternalReference.ExternalSystem getExternalSystem() {
                return externalSystem;
            }

            /**
             * Sets the value of the externalSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link Experiment.ExternalReferences.ExternalReference.ExternalSystem }
             *     
             */
            public void setExternalSystem(Experiment.ExternalReferences.ExternalReference.ExternalSystem value) {
                this.externalSystem = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="systemUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *       &lt;/sequence>
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "systemUrl"
            })
            public static class ExternalSystem {

                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String systemUrl;
                @XmlAttribute(name = "name", required = true)
                protected String name;
                @XmlAttribute(name = "owner")
                protected String owner;

                /**
                 * Gets the value of the systemUrl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSystemUrl() {
                    return systemUrl;
                }

                /**
                 * Sets the value of the systemUrl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSystemUrl(String value) {
                    this.systemUrl = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the owner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOwner() {
                    return owner;
                }

                /**
                 * Sets the value of the owner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOwner(String value) {
                    this.owner = value;
                }

            }

        }

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
     *         &lt;element name="projectExperiment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}description" minOccurs="0"/>
     *                   &lt;element name="precedingExperiment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{}link"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" use="required" type="{}bardID" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "projectExperiment"
    })
    public static class ProjectExperiments {

        @XmlElement(required = true)
        protected List<Experiment.ProjectExperiments.ProjectExperiment> projectExperiment;

        /**
         * Gets the value of the projectExperiment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectExperiment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProjectExperiment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Experiment.ProjectExperiments.ProjectExperiment }
         * 
         * 
         */
        public List<Experiment.ProjectExperiments.ProjectExperiment> getProjectExperiment() {
            if (projectExperiment == null) {
                projectExperiment = new ArrayList<Experiment.ProjectExperiments.ProjectExperiment>();
            }
            return this.projectExperiment;
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
         *         &lt;element ref="{}description" minOccurs="0"/>
         *         &lt;element name="precedingExperiment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{}link"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" use="required" type="{}bardID" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
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
            "description",
            "precedingExperiment",
            "link"
        })
        public static class ProjectExperiment {

            @XmlElement(nillable = true)
            protected String description;
            protected Experiment.ProjectExperiments.ProjectExperiment.PrecedingExperiment precedingExperiment;
            protected List<Link> link;

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
             * Gets the value of the precedingExperiment property.
             * 
             * @return
             *     possible object is
             *     {@link Experiment.ProjectExperiments.ProjectExperiment.PrecedingExperiment }
             *     
             */
            public Experiment.ProjectExperiments.ProjectExperiment.PrecedingExperiment getPrecedingExperiment() {
                return precedingExperiment;
            }

            /**
             * Sets the value of the precedingExperiment property.
             * 
             * @param value
             *     allowed object is
             *     {@link Experiment.ProjectExperiments.ProjectExperiment.PrecedingExperiment }
             *     
             */
            public void setPrecedingExperiment(Experiment.ProjectExperiments.ProjectExperiment.PrecedingExperiment value) {
                this.precedingExperiment = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element ref="{}link"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" use="required" type="{}bardID" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "link"
            })
            public static class PrecedingExperiment {

                protected Link link;
                @XmlAttribute(name = "id", required = true)
                protected BigInteger id;

                /**
                 * Gets the value of the link property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Link }
                 *     
                 */
                public Link getLink() {
                    return link;
                }

                /**
                 * Sets the value of the link property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Link }
                 *     
                 */
                public void setLink(Link value) {
                    this.link = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setId(BigInteger value) {
                    this.id = value;
                }

            }

        }

    }

}
