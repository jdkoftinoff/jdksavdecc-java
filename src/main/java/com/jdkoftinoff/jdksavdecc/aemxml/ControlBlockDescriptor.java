//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 08:56:32 PM PDT 
//


package com.jdkoftinoff.jdksavdecc.aemxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * See IEEE Std 1722.1-2013 Clause 7.2.33
 * 
 * <p>Java class for ControlBlockDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlBlockDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="object_name" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}AVDECCString" minOccurs="0"/>
 *         &lt;element name="localized_description" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}LocalizedStringContainer"/>
 *         &lt;element name="final_control_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
 *         &lt;element name="controls" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}ControlDescriptors" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlBlockDescriptor", propOrder = {
    "objectName",
    "localizedDescription",
    "finalControlIndex",
    "controls"
})
public class ControlBlockDescriptor {

    @XmlElement(name = "object_name")
    protected String objectName;
    @XmlElement(name = "localized_description", required = true)
    protected LocalizedStringContainer localizedDescription;
    @XmlElement(name = "final_control_index", required = true)
    protected String finalControlIndex;
    protected List<ControlDescriptors> controls;
    @XmlAttribute(name = "symbol")
    protected String symbol;

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the localizedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public LocalizedStringContainer getLocalizedDescription() {
        return localizedDescription;
    }

    /**
     * Sets the value of the localizedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public void setLocalizedDescription(LocalizedStringContainer value) {
        this.localizedDescription = value;
    }

    /**
     * Gets the value of the finalControlIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalControlIndex() {
        return finalControlIndex;
    }

    /**
     * Sets the value of the finalControlIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalControlIndex(String value) {
        this.finalControlIndex = value;
    }

    /**
     * Gets the value of the controls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlDescriptors }
     * 
     * 
     */
    public List<ControlDescriptors> getControls() {
        if (controls == null) {
            controls = new ArrayList<ControlDescriptors>();
        }
        return this.controls;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

}
