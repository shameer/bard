//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.19 at 09:45:46 AM EDT 
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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="projectName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element name="projectSteps" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="projectStep" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}description"/>
 *                             &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="projectStepId" use="required" type="{}bardID" />
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
 *         &lt;element name="projectContextItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="projectContextItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attribute" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{}link" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="valueControlled" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{}link" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="extValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="projectContextItemId" use="required" type="{}bardID" />
 *                           &lt;attribute name="parentGroup" type="{}bardID" />
 *                           &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="valueDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="valueNum" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="valueMin" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="valueMax" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="projectId" use="required" type="{}bardID" />
 *       &lt;attribute name="groupType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Project"/>
 *             &lt;enumeration value="Campaign"/>
 *             &lt;enumeration value="Panel"/>
 *             &lt;enumeration value="Study"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "projectName",
    "description",
    "projectSteps",
    "link",
    "projectContextItems"
})
@XmlRootElement(name = "project")
public class Project {

    @XmlElement(required = true)
    protected String projectName;
    @XmlElement(nillable = true)
    protected String description;
    protected Project.ProjectSteps projectSteps;
    protected List<Link> link;
    protected Project.ProjectContextItems projectContextItems;
    @XmlAttribute(name = "projectId", required = true)
    protected BigInteger projectId;
    @XmlAttribute(name = "groupType", required = true)
    protected String groupType;
    @XmlAttribute(name = "readyForExtraction")
    protected String readyForExtraction;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Description for current element
     *                         
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
     * Gets the value of the projectSteps property.
     * 
     * @return
     *     possible object is
     *     {@link Project.ProjectSteps }
     *     
     */
    public Project.ProjectSteps getProjectSteps() {
        return projectSteps;
    }

    /**
     * Sets the value of the projectSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.ProjectSteps }
     *     
     */
    public void setProjectSteps(Project.ProjectSteps value) {
        this.projectSteps = value;
    }

    /**
     * Gets the value of the link property.
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
     * Gets the value of the projectContextItems property.
     * 
     * @return
     *     possible object is
     *     {@link Project.ProjectContextItems }
     *     
     */
    public Project.ProjectContextItems getProjectContextItems() {
        return projectContextItems;
    }

    /**
     * Sets the value of the projectContextItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.ProjectContextItems }
     *     
     */
    public void setProjectContextItems(Project.ProjectContextItems value) {
        this.projectContextItems = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectId(BigInteger value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
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
     *         &lt;element name="projectContextItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attribute" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{}link" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="valueControlled" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{}link" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="extValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="projectContextItemId" use="required" type="{}bardID" />
     *                 &lt;attribute name="parentGroup" type="{}bardID" />
     *                 &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="valueDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="valueNum" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="valueMin" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="valueMax" type="{http://www.w3.org/2001/XMLSchema}double" />
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
        "projectContextItem"
    })
    public static class ProjectContextItems {

        @XmlElement(required = true)
        protected List<Project.ProjectContextItems.ProjectContextItem> projectContextItem;

        /**
         * Gets the value of the projectContextItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectContextItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProjectContextItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Project.ProjectContextItems.ProjectContextItem }
         * 
         * 
         */
        public List<Project.ProjectContextItems.ProjectContextItem> getProjectContextItem() {
            if (projectContextItem == null) {
                projectContextItem = new ArrayList<Project.ProjectContextItems.ProjectContextItem>();
            }
            return this.projectContextItem;
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
         *         &lt;element name="attribute" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{}link" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="valueControlled" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{}link" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="extValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="projectContextItemId" use="required" type="{}bardID" />
         *       &lt;attribute name="parentGroup" type="{}bardID" />
         *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="valueDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="valueNum" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="valueMin" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="valueMax" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attribute",
            "valueControlled",
            "extValueId"
        })
        public static class ProjectContextItem {

            protected Project.ProjectContextItems.ProjectContextItem.Attribute attribute;
            protected Project.ProjectContextItems.ProjectContextItem.ValueControlled valueControlled;
            protected String extValueId;
            @XmlAttribute(name = "projectContextItemId", required = true)
            protected BigInteger projectContextItemId;
            @XmlAttribute(name = "parentGroup")
            protected BigInteger parentGroup;
            @XmlAttribute(name = "qualifier")
            protected String qualifier;
            @XmlAttribute(name = "valueDisplay")
            protected String valueDisplay;
            @XmlAttribute(name = "valueNum")
            protected Double valueNum;
            @XmlAttribute(name = "valueMin")
            protected Double valueMin;
            @XmlAttribute(name = "valueMax")
            protected Double valueMax;

            /**
             * Gets the value of the attribute property.
             * 
             * @return
             *     possible object is
             *     {@link Project.ProjectContextItems.ProjectContextItem.Attribute }
             *     
             */
            public Project.ProjectContextItems.ProjectContextItem.Attribute getAttribute() {
                return attribute;
            }

            /**
             * Sets the value of the attribute property.
             * 
             * @param value
             *     allowed object is
             *     {@link Project.ProjectContextItems.ProjectContextItem.Attribute }
             *     
             */
            public void setAttribute(Project.ProjectContextItems.ProjectContextItem.Attribute value) {
                this.attribute = value;
            }

            /**
             * Gets the value of the valueControlled property.
             * 
             * @return
             *     possible object is
             *     {@link Project.ProjectContextItems.ProjectContextItem.ValueControlled }
             *     
             */
            public Project.ProjectContextItems.ProjectContextItem.ValueControlled getValueControlled() {
                return valueControlled;
            }

            /**
             * Sets the value of the valueControlled property.
             * 
             * @param value
             *     allowed object is
             *     {@link Project.ProjectContextItems.ProjectContextItem.ValueControlled }
             *     
             */
            public void setValueControlled(Project.ProjectContextItems.ProjectContextItem.ValueControlled value) {
                this.valueControlled = value;
            }

            /**
             * Gets the value of the extValueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtValueId() {
                return extValueId;
            }

            /**
             * Sets the value of the extValueId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtValueId(String value) {
                this.extValueId = value;
            }

            /**
             * Gets the value of the projectContextItemId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getProjectContextItemId() {
                return projectContextItemId;
            }

            /**
             * Sets the value of the projectContextItemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setProjectContextItemId(BigInteger value) {
                this.projectContextItemId = value;
            }

            /**
             * Gets the value of the parentGroup property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getParentGroup() {
                return parentGroup;
            }

            /**
             * Sets the value of the parentGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setParentGroup(BigInteger value) {
                this.parentGroup = value;
            }

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQualifier(String value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the valueDisplay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueDisplay() {
                return valueDisplay;
            }

            /**
             * Sets the value of the valueDisplay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueDisplay(String value) {
                this.valueDisplay = value;
            }

            /**
             * Gets the value of the valueNum property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getValueNum() {
                return valueNum;
            }

            /**
             * Sets the value of the valueNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setValueNum(Double value) {
                this.valueNum = value;
            }

            /**
             * Gets the value of the valueMin property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getValueMin() {
                return valueMin;
            }

            /**
             * Sets the value of the valueMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setValueMin(Double value) {
                this.valueMin = value;
            }

            /**
             * Gets the value of the valueMax property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getValueMax() {
                return valueMax;
            }

            /**
             * Sets the value of the valueMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setValueMax(Double value) {
                this.valueMax = value;
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
             *         &lt;element ref="{}link" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class Attribute {

                protected Link link;
                @XmlAttribute(name = "label", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLabel() {
                    return label;
                }

                /**
                 * Sets the value of the label property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLabel(String value) {
                    this.label = value;
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
             *         &lt;element ref="{}link" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class ValueControlled {

                protected Link link;
                @XmlAttribute(name = "label", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLabel() {
                    return label;
                }

                /**
                 * Sets the value of the label property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLabel(String value) {
                    this.label = value;
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
     *         &lt;element name="projectStep" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}description"/>
     *                   &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="projectStepId" use="required" type="{}bardID" />
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
        "projectStep"
    })
    public static class ProjectSteps {

        @XmlElement(required = true)
        protected List<Project.ProjectSteps.ProjectStep> projectStep;

        /**
         * Gets the value of the projectStep property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectStep property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProjectStep().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Project.ProjectSteps.ProjectStep }
         * 
         * 
         */
        public List<Project.ProjectSteps.ProjectStep> getProjectStep() {
            if (projectStep == null) {
                projectStep = new ArrayList<Project.ProjectSteps.ProjectStep>();
            }
            return this.projectStep;
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
         *         &lt;element ref="{}description"/>
         *         &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="projectStepId" use="required" type="{}bardID" />
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
            "link"
        })
        public static class ProjectStep {

            @XmlElement(required = true, nillable = true)
            protected String description;
            protected List<Link> link;
            @XmlAttribute(name = "projectStepId", required = true)
            protected BigInteger projectStepId;

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
             * Gets the value of the link property.
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
             * Gets the value of the projectStepId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getProjectStepId() {
                return projectStepId;
            }

            /**
             * Sets the value of the projectStepId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setProjectStepId(BigInteger value) {
                this.projectStepId = value;
            }

        }

    }

}
