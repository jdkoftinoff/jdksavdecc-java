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
 * <p>Java class for AudioMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stream_index" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
 *         &lt;element name="stream_channel" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="cluster_offset" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="cluster_channel" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioMapping", propOrder = {
    "streamIndex",
    "streamChannel",
    "clusterOffset",
    "clusterChannel"
})
public class AudioMapping {

    @XmlElement(name = "stream_index", required = true)
    protected String streamIndex;
    @XmlElement(name = "stream_channel", required = true)
    protected String streamChannel;
    @XmlElement(name = "cluster_offset", required = true)
    protected String clusterOffset;
    @XmlElement(name = "cluster_channel", required = true)
    protected String clusterChannel;

    /**
     * Gets the value of the streamIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamIndex() {
        return streamIndex;
    }

    /**
     * Sets the value of the streamIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamIndex(String value) {
        this.streamIndex = value;
    }

    /**
     * Gets the value of the streamChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamChannel() {
        return streamChannel;
    }

    /**
     * Sets the value of the streamChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamChannel(String value) {
        this.streamChannel = value;
    }

    /**
     * Gets the value of the clusterOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterOffset() {
        return clusterOffset;
    }

    /**
     * Sets the value of the clusterOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterOffset(String value) {
        this.clusterOffset = value;
    }

    /**
     * Gets the value of the clusterChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterChannel() {
        return clusterChannel;
    }

    /**
     * Sets the value of the clusterChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterChannel(String value) {
        this.clusterChannel = value;
    }

}
