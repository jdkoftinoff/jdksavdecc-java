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
 * See IEEE Std 1722.1-2013 Clause 7.3.5.2.8 - CONTROL_GPTP_TIME
 * 
 * <p>Java class for T0023 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T0023">
 *   &lt;complexContent>
 *     &lt;extension base="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Value">
 *       &lt;sequence>
 *         &lt;element name="gptp_seconds" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}GPTPSeconds"/>
 *         &lt;element name="gptp_nanoseconds" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}GPTPNanoseconds"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T0023", propOrder = {
    "gptpSeconds",
    "gptpNanoseconds"
})
public class T0023
    extends Value
{

    @XmlElement(name = "gptp_seconds", required = true)
    protected String gptpSeconds;
    @XmlElement(name = "gptp_nanoseconds", required = true)
    protected String gptpNanoseconds;

    /**
     * Gets the value of the gptpSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGptpSeconds() {
        return gptpSeconds;
    }

    /**
     * Sets the value of the gptpSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGptpSeconds(String value) {
        this.gptpSeconds = value;
    }

    /**
     * Gets the value of the gptpNanoseconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGptpNanoseconds() {
        return gptpNanoseconds;
    }

    /**
     * Sets the value of the gptpNanoseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGptpNanoseconds(String value) {
        this.gptpNanoseconds = value;
    }

}
