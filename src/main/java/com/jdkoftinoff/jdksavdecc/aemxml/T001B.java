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
 * See IEEE Std 1722.1-2013 Clause 7.3.5.2.3 - CONTROL_ARRAY_INT64
 * 
 * <p>Java class for T001b complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T001b">
 *   &lt;complexContent>
 *     &lt;extension base="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Value">
 *       &lt;sequence>
 *         &lt;element name="units" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Units"/>
 *         &lt;element name="minimum" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Octlet"/>
 *         &lt;element name="maximum" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Octlet"/>
 *         &lt;element name="step" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Octlet"/>
 *         &lt;element name="default" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Octlet"/>
 *         &lt;element name="current_values" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}CurrentSignedOctlets" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T001b", propOrder = {
    "units",
    "minimum",
    "maximum",
    "step",
    "_default",
    "currentValues"
})
public class T001B
    extends Value
{

    @XmlElement(required = true)
    protected String units;
    @XmlElement(required = true)
    protected String minimum;
    @XmlElement(required = true)
    protected String maximum;
    @XmlElement(required = true)
    protected String step;
    @XmlElement(name = "default", required = true)
    protected String _default;
    @XmlElement(name = "current_values")
    protected CurrentSignedOctlets currentValues;

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimum(String value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximum(String value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the currentValues property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSignedOctlets }
     *     
     */
    public CurrentSignedOctlets getCurrentValues() {
        return currentValues;
    }

    /**
     * Sets the value of the currentValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSignedOctlets }
     *     
     */
    public void setCurrentValues(CurrentSignedOctlets value) {
        this.currentValues = value;
    }

}
