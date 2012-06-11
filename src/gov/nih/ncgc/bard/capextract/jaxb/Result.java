//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 10:26:33 AM EDT 
//


package gov.nih.ncgc.bard.capextract.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}status"/>
 *         &lt;element name="substance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}resultContextItems" minOccurs="0"/>
 *         &lt;element name="resultHierarchy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="parentResultId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="hierarchyType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Child"/>
 *                       &lt;enumeration value="Derives"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}link" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="valueDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valueNum" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="valueMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="valueMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="qualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="2"/>
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
    "status",
    "substance",
    "resultContextItems",
    "resultHierarchy",
    "link"
})
@XmlRootElement(name = "result")
public class Result {

    @XmlElement(required = true)
    protected String status;
    protected Result.Substance substance;
    protected ResultContextItems resultContextItems;
    protected List<Result.ResultHierarchy> resultHierarchy;
    @XmlElement(required = true)
    protected List<Link> link;
    @XmlAttribute(name = "valueDisplay")
    protected String valueDisplay;
    @XmlAttribute(name = "valueNum")
    protected Float valueNum;
    @XmlAttribute(name = "valueMin")
    protected Float valueMin;
    @XmlAttribute(name = "valueMax")
    protected Float valueMax;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "readyForExtraction")
    protected String readyForExtraction;

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
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link Result.Substance }
     *     
     */
    public Result.Substance getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.Substance }
     *     
     */
    public void setSubstance(Result.Substance value) {
        this.substance = value;
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
     * Gets the value of the resultHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result.ResultHierarchy }
     * 
     * 
     */
    public List<Result.ResultHierarchy> getResultHierarchy() {
        if (resultHierarchy == null) {
            resultHierarchy = new ArrayList<Result.ResultHierarchy>();
        }
        return this.resultHierarchy;
    }

    /**
     * Link to experiment and next list of results if any Gets the value of the link property.
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
     *     {@link Float }
     *     
     */
    public Float getValueNum() {
        return valueNum;
    }

    /**
     * Sets the value of the valueNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValueNum(Float value) {
        this.valueNum = value;
    }

    /**
     * Gets the value of the valueMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValueMin() {
        return valueMin;
    }

    /**
     * Sets the value of the valueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValueMin(Float value) {
        this.valueMin = value;
    }

    /**
     * Gets the value of the valueMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValueMax() {
        return valueMax;
    }

    /**
     * Sets the value of the valueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValueMax(Float value) {
        this.valueMax = value;
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
     *       &lt;attribute name="parentResultId" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="hierarchyType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Child"/>
     *             &lt;enumeration value="Derives"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResultHierarchy {

        @XmlAttribute(name = "parentResultId")
        protected Long parentResultId;
        @XmlAttribute(name = "hierarchyType")
        protected String hierarchyType;

        /**
         * Gets the value of the parentResultId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getParentResultId() {
            return parentResultId;
        }

        /**
         * Sets the value of the parentResultId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setParentResultId(Long value) {
            this.parentResultId = value;
        }

        /**
         * Gets the value of the hierarchyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHierarchyType() {
            return hierarchyType;
        }

        /**
         * Sets the value of the hierarchyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHierarchyType(String value) {
            this.hierarchyType = value;
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
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Substance {

        @XmlAttribute(name = "url")
        @XmlSchemaType(name = "anyURI")
        protected String url;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}