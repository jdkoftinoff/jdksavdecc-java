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
 * See IEEE Std 1722.1-2013 Clause 7.2.14
 * 
 * <p>Java class for ExternalPortDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalPortDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clock_domain_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
 *         &lt;element name="port_flags" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="controls" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}ControlDescriptors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signal_type" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorType"/>
 *         &lt;element name="signal_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
 *         &lt;element name="signal_output" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="block_latency" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Quadlet"/>
 *         &lt;element name="jack_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
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
@XmlType(name = "ExternalPortDescriptor", propOrder = {
    "clockDomainIndex",
    "portFlags",
    "controls",
    "signalType",
    "signalIndex",
    "signalOutput",
    "blockLatency",
    "jackIndex"
})
public class ExternalPortDescriptor {

    @XmlElement(name = "clock_domain_index", required = true)
    protected String clockDomainIndex;
    @XmlElement(name = "port_flags", required = true)
    protected String portFlags;
    protected List<ControlDescriptors> controls;
    @XmlElement(name = "signal_type", required = true)
    protected String signalType;
    @XmlElement(name = "signal_index", required = true)
    protected String signalIndex;
    @XmlElement(name = "signal_output", required = true)
    protected String signalOutput;
    @XmlElement(name = "block_latency", required = true)
    protected String blockLatency;
    @XmlElement(name = "jack_index", required = true)
    protected String jackIndex;
    @XmlAttribute(name = "symbol")
    protected String symbol;

    /**
     * Gets the value of the clockDomainIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockDomainIndex() {
        return clockDomainIndex;
    }

    /**
     * Sets the value of the clockDomainIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockDomainIndex(String value) {
        this.clockDomainIndex = value;
    }

    /**
     * Gets the value of the portFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortFlags() {
        return portFlags;
    }

    /**
     * Sets the value of the portFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortFlags(String value) {
        this.portFlags = value;
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
     * Gets the value of the signalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalType() {
        return signalType;
    }

    /**
     * Sets the value of the signalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalType(String value) {
        this.signalType = value;
    }

    /**
     * Gets the value of the signalIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalIndex() {
        return signalIndex;
    }

    /**
     * Sets the value of the signalIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalIndex(String value) {
        this.signalIndex = value;
    }

    /**
     * Gets the value of the signalOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalOutput() {
        return signalOutput;
    }

    /**
     * Sets the value of the signalOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalOutput(String value) {
        this.signalOutput = value;
    }

    /**
     * Gets the value of the blockLatency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockLatency() {
        return blockLatency;
    }

    /**
     * Sets the value of the blockLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockLatency(String value) {
        this.blockLatency = value;
    }

    /**
     * Gets the value of the jackIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJackIndex() {
        return jackIndex;
    }

    /**
     * Sets the value of the jackIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJackIndex(String value) {
        this.jackIndex = value;
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
