//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 10:26:33 AM EDT 
//


package gov.nih.ncgc.bard.capextract.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for descriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;element name="synonyms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="descriptorId" use="required" type="{}bardID" />
 *       &lt;attribute name="parentDescriptorId" type="{}bardID" />
 *       &lt;attribute name="elementId" type="{}bardID" />
 *       &lt;attribute name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptorType", propOrder = {
    "elementStatus",
    "label",
    "description",
    "synonyms",
    "acronym"
})
public class DescriptorType {

    @XmlElement(required = true)
    protected String elementStatus;
    protected String label;
    @XmlElement(nillable = true)
    protected String description;
    protected String synonyms;
    protected String acronym;
    @XmlAttribute(name = "descriptorId", required = true)
    protected BigInteger descriptorId;
    @XmlAttribute(name = "parentDescriptorId")
    protected BigInteger parentDescriptorId;
    @XmlAttribute(name = "elementId")
    protected BigInteger elementId;
    @XmlAttribute(name = "abbreviation")
    protected String abbreviation;
    @XmlAttribute(name = "externalUrl")
    protected String externalUrl;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the elementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementStatus() {
        return elementStatus;
    }

    /**
     * Sets the value of the elementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementStatus(String value) {
        this.elementStatus = value;
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
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynonyms(String value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the acronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

    /**
     * Gets the value of the descriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDescriptorId() {
        return descriptorId;
    }

    /**
     * Sets the value of the descriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDescriptorId(BigInteger value) {
        this.descriptorId = value;
    }

    /**
     * Gets the value of the parentDescriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentDescriptorId() {
        return parentDescriptorId;
    }

    /**
     * Sets the value of the parentDescriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentDescriptorId(BigInteger value) {
        this.parentDescriptorId = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElementId(BigInteger value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the externalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUrl() {
        return externalUrl;
    }

    /**
     * Sets the value of the externalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUrl(String value) {
        this.externalUrl = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}