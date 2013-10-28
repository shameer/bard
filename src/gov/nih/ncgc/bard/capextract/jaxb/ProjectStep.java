//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.25 at 12:13:33 AM EDT 
//


package gov.nih.ncgc.bard.capextract.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="edgeName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}contexts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="projectStepId" use="required" type="{}bardID" />
 *       &lt;attribute name="nextProjectExperimentRef" type="{}bardID" />
 *       &lt;attribute name="precedingProjectExperimentRef" type="{}bardID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "edgeName",
    "contexts"
})
@XmlRootElement(name = "projectStep")
public class ProjectStep {

    protected Object edgeName;
    protected Contexts contexts;
    @XmlAttribute(required = true)
    protected BigInteger projectStepId;
    @XmlAttribute
    protected BigInteger nextProjectExperimentRef;
    @XmlAttribute
    protected BigInteger precedingProjectExperimentRef;

    /**
     * Gets the value of the edgeName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEdgeName() {
        return edgeName;
    }

    /**
     * Sets the value of the edgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEdgeName(Object value) {
        this.edgeName = value;
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

    /**
     * Gets the value of the nextProjectExperimentRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextProjectExperimentRef() {
        return nextProjectExperimentRef;
    }

    /**
     * Sets the value of the nextProjectExperimentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextProjectExperimentRef(BigInteger value) {
        this.nextProjectExperimentRef = value;
    }

    /**
     * Gets the value of the precedingProjectExperimentRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecedingProjectExperimentRef() {
        return precedingProjectExperimentRef;
    }

    /**
     * Sets the value of the precedingProjectExperimentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecedingProjectExperimentRef(BigInteger value) {
        this.precedingProjectExperimentRef = value;
    }

}
