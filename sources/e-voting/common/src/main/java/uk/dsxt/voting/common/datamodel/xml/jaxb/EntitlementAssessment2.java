//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.datamodel.xml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EntitlementAssessment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementAssessment2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SctiesBlckgDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="SctiesBlckgSTPDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="SctiesBlckgMktDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="SctiesBlckgPrdEndDt" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="EntitlmntFxgDt" type="{}DateFormat3Choice" minOccurs="0"/>
 *         &lt;element name="RegnSctiesDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="RegnSctiesSTPDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="RegnSctiesMktDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="RegnPrtcptnDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="RegnPrtcptnSTPDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="RegnPrtcptnMktDdln" type="{}DateFormat2Choice" minOccurs="0"/>
 *         &lt;element name="Entitlmnt" type="{}Entitlement1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementAssessment2", propOrder = {
    "sctiesBlckgDdln",
    "sctiesBlckgSTPDdln",
    "sctiesBlckgMktDdln",
    "sctiesBlckgPrdEndDt",
    "entitlmntFxgDt",
    "regnSctiesDdln",
    "regnSctiesSTPDdln",
    "regnSctiesMktDdln",
    "regnPrtcptnDdln",
    "regnPrtcptnSTPDdln",
    "regnPrtcptnMktDdln",
    "entitlmnt"
})
public class EntitlementAssessment2 {

    @XmlElement(name = "SctiesBlckgDdln")
    protected DateFormat2Choice sctiesBlckgDdln;
    @XmlElement(name = "SctiesBlckgSTPDdln")
    protected DateFormat2Choice sctiesBlckgSTPDdln;
    @XmlElement(name = "SctiesBlckgMktDdln")
    protected DateFormat2Choice sctiesBlckgMktDdln;
    @XmlElement(name = "SctiesBlckgPrdEndDt")
    protected XMLGregorianCalendar sctiesBlckgPrdEndDt;
    @XmlElement(name = "EntitlmntFxgDt")
    protected DateFormat3Choice entitlmntFxgDt;
    @XmlElement(name = "RegnSctiesDdln")
    protected DateFormat2Choice regnSctiesDdln;
    @XmlElement(name = "RegnSctiesSTPDdln")
    protected DateFormat2Choice regnSctiesSTPDdln;
    @XmlElement(name = "RegnSctiesMktDdln")
    protected DateFormat2Choice regnSctiesMktDdln;
    @XmlElement(name = "RegnPrtcptnDdln")
    protected DateFormat2Choice regnPrtcptnDdln;
    @XmlElement(name = "RegnPrtcptnSTPDdln")
    protected DateFormat2Choice regnPrtcptnSTPDdln;
    @XmlElement(name = "RegnPrtcptnMktDdln")
    protected DateFormat2Choice regnPrtcptnMktDdln;
    @XmlElement(name = "Entitlmnt")
    protected Entitlement1Choice entitlmnt;

    /**
     * Gets the value of the sctiesBlckgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgDdln() {
        return sctiesBlckgDdln;
    }

    /**
     * Sets the value of the sctiesBlckgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setSctiesBlckgDdln(DateFormat2Choice value) {
        this.sctiesBlckgDdln = value;
    }

    /**
     * Gets the value of the sctiesBlckgSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgSTPDdln() {
        return sctiesBlckgSTPDdln;
    }

    /**
     * Sets the value of the sctiesBlckgSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setSctiesBlckgSTPDdln(DateFormat2Choice value) {
        this.sctiesBlckgSTPDdln = value;
    }

    /**
     * Gets the value of the sctiesBlckgMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgMktDdln() {
        return sctiesBlckgMktDdln;
    }

    /**
     * Sets the value of the sctiesBlckgMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setSctiesBlckgMktDdln(DateFormat2Choice value) {
        this.sctiesBlckgMktDdln = value;
    }

    /**
     * Gets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSctiesBlckgPrdEndDt() {
        return sctiesBlckgPrdEndDt;
    }

    /**
     * Sets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSctiesBlckgPrdEndDt(XMLGregorianCalendar value) {
        this.sctiesBlckgPrdEndDt = value;
    }

    /**
     * Gets the value of the entitlmntFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getEntitlmntFxgDt() {
        return entitlmntFxgDt;
    }

    /**
     * Sets the value of the entitlmntFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public void setEntitlmntFxgDt(DateFormat3Choice value) {
        this.entitlmntFxgDt = value;
    }

    /**
     * Gets the value of the regnSctiesDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesDdln() {
        return regnSctiesDdln;
    }

    /**
     * Sets the value of the regnSctiesDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnSctiesDdln(DateFormat2Choice value) {
        this.regnSctiesDdln = value;
    }

    /**
     * Gets the value of the regnSctiesSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesSTPDdln() {
        return regnSctiesSTPDdln;
    }

    /**
     * Sets the value of the regnSctiesSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnSctiesSTPDdln(DateFormat2Choice value) {
        this.regnSctiesSTPDdln = value;
    }

    /**
     * Gets the value of the regnSctiesMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesMktDdln() {
        return regnSctiesMktDdln;
    }

    /**
     * Sets the value of the regnSctiesMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnSctiesMktDdln(DateFormat2Choice value) {
        this.regnSctiesMktDdln = value;
    }

    /**
     * Gets the value of the regnPrtcptnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnDdln() {
        return regnPrtcptnDdln;
    }

    /**
     * Sets the value of the regnPrtcptnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnPrtcptnDdln(DateFormat2Choice value) {
        this.regnPrtcptnDdln = value;
    }

    /**
     * Gets the value of the regnPrtcptnSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnSTPDdln() {
        return regnPrtcptnSTPDdln;
    }

    /**
     * Sets the value of the regnPrtcptnSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnPrtcptnSTPDdln(DateFormat2Choice value) {
        this.regnPrtcptnSTPDdln = value;
    }

    /**
     * Gets the value of the regnPrtcptnMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnMktDdln() {
        return regnPrtcptnMktDdln;
    }

    /**
     * Sets the value of the regnPrtcptnMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public void setRegnPrtcptnMktDdln(DateFormat2Choice value) {
        this.regnPrtcptnMktDdln = value;
    }

    /**
     * Gets the value of the entitlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement1Choice }
     *     
     */
    public Entitlement1Choice getEntitlmnt() {
        return entitlmnt;
    }

    /**
     * Sets the value of the entitlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement1Choice }
     *     
     */
    public void setEntitlmnt(Entitlement1Choice value) {
        this.entitlmnt = value;
    }

}