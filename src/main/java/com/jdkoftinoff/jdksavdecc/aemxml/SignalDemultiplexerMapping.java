//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 08:56:32 PM PDT 
//


package com.jdkoftinoff.jdksavdecc.aemxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalDemultiplexerMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalDemultiplexerMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sub_signal_start" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="sub_signal_count" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="output_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalDemultiplexerMapping", propOrder = {
    "subSignalStart",
    "subSignalCount",
    "outputIndex"
})
public class SignalDemultiplexerMapping {

    @XmlElement(name = "sub_signal_start", required = true)
    protected String subSignalStart;
    @XmlElement(name = "sub_signal_count", required = true)
    protected String subSignalCount;
    @XmlElement(name = "output_index", required = true)
    protected String outputIndex;

    /**
     * Gets the value of the subSignalStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSignalStart() {
        return subSignalStart;
    }

    /**
     * Sets the value of the subSignalStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSignalStart(String value) {
        this.subSignalStart = value;
    }

    /**
     * Gets the value of the subSignalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSignalCount() {
        return subSignalCount;
    }

    /**
     * Sets the value of the subSignalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSignalCount(String value) {
        this.subSignalCount = value;
    }

    /**
     * Gets the value of the outputIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIndex() {
        return outputIndex;
    }

    /**
     * Sets the value of the outputIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIndex(String value) {
        this.outputIndex = value;
    }

}
