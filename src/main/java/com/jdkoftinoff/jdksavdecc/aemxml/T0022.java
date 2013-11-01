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
 * See IEEE Std 1722.1-2013 Clause 7.3.5.2.7 - CONTROL_SAMPLE_RATE
 * 
 * <p>Java class for T0022 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T0022">
 *   &lt;complexContent>
 *     &lt;extension base="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Value">
 *       &lt;sequence>
 *         &lt;element name="pull" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Octet"/>
 *         &lt;element name="base_frequency" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Quadlet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T0022", propOrder = {
    "pull",
    "baseFrequency"
})
public class T0022
    extends Value
{

    @XmlElement(required = true)
    protected String pull;
    @XmlElement(name = "base_frequency", required = true)
    protected String baseFrequency;

    /**
     * Gets the value of the pull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPull() {
        return pull;
    }

    /**
     * Sets the value of the pull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPull(String value) {
        this.pull = value;
    }

    /**
     * Gets the value of the baseFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFrequency() {
        return baseFrequency;
    }

    /**
     * Sets the value of the baseFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFrequency(String value) {
        this.baseFrequency = value;
    }

}
