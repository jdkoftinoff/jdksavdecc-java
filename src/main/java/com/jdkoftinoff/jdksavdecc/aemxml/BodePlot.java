//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 08:56:32 PM PDT 
//


package com.jdkoftinoff.jdksavdecc.aemxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodePlot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodePlot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Float"/>
 *         &lt;element name="magnitude" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Float"/>
 *         &lt;element name="phase" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodePlot", propOrder = {
    "frequency",
    "magnitude",
    "phase"
})
public class BodePlot {

    protected float frequency;
    protected float magnitude;
    protected float phase;

    /**
     * Gets the value of the frequency property.
     * 
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(float value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the magnitude property.
     * 
     */
    public float getMagnitude() {
        return magnitude;
    }

    /**
     * Sets the value of the magnitude property.
     * 
     */
    public void setMagnitude(float value) {
        this.magnitude = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     */
    public float getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     */
    public void setPhase(float value) {
        this.phase = value;
    }

}
