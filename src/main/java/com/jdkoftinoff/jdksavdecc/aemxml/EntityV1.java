//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 08:56:32 PM PDT 
//


package com.jdkoftinoff.jdksavdecc.aemxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * See IEEE Std 1722.1-2013 Clause 7.2.1
 * 
 * <p>Java class for EntityV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity_id" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}EUI64"/>
 *         &lt;element name="entity_model_id" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}EUI64"/>
 *         &lt;element name="entity_capabilities" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Quadlet"/>
 *         &lt;element name="talker_stream_sources" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="talker_capabilties" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="listener_stream_sinks" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="listener_capabilities" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Doublet"/>
 *         &lt;element name="controller_capabilities" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}Quadlet"/>
 *         &lt;element name="association_id" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}EUI64"/>
 *         &lt;element name="entity_name" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}AVDECCString"/>
 *         &lt;element name="vendor_name" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}LocalizedStringContainer"/>
 *         &lt;element name="model_name" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}LocalizedStringContainer"/>
 *         &lt;element name="firmware_version" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}AVDECCString"/>
 *         &lt;element name="group_name" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}AVDECCString"/>
 *         &lt;element name="serial_number" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}AVDECCString"/>
 *         &lt;element name="current_configuration" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}DescriptorIndex"/>
 *         &lt;element name="configurations" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}ConfigurationDescriptors"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityV1", propOrder = {
    "entityId",
    "entityModelId",
    "entityCapabilities",
    "talkerStreamSources",
    "talkerCapabilties",
    "listenerStreamSinks",
    "listenerCapabilities",
    "controllerCapabilities",
    "associationId",
    "entityName",
    "vendorName",
    "modelName",
    "firmwareVersion",
    "groupName",
    "serialNumber",
    "currentConfiguration",
    "configurations"
})
public class EntityV1 {

    @XmlElement(name = "entity_id", required = true)
    protected String entityId;
    @XmlElement(name = "entity_model_id", required = true)
    protected String entityModelId;
    @XmlElement(name = "entity_capabilities", required = true)
    protected String entityCapabilities;
    @XmlElement(name = "talker_stream_sources", required = true)
    protected String talkerStreamSources;
    @XmlElement(name = "talker_capabilties", required = true)
    protected String talkerCapabilties;
    @XmlElement(name = "listener_stream_sinks", required = true)
    protected String listenerStreamSinks;
    @XmlElement(name = "listener_capabilities", required = true)
    protected String listenerCapabilities;
    @XmlElement(name = "controller_capabilities", required = true)
    protected String controllerCapabilities;
    @XmlElement(name = "association_id", required = true)
    protected String associationId;
    @XmlElement(name = "entity_name", required = true)
    protected String entityName;
    @XmlElement(name = "vendor_name", required = true)
    protected LocalizedStringContainer vendorName;
    @XmlElement(name = "model_name", required = true)
    protected LocalizedStringContainer modelName;
    @XmlElement(name = "firmware_version", required = true)
    protected String firmwareVersion;
    @XmlElement(name = "group_name", required = true)
    protected String groupName;
    @XmlElement(name = "serial_number", required = true)
    protected String serialNumber;
    @XmlElement(name = "current_configuration", required = true)
    protected String currentConfiguration;
    @XmlElement(required = true)
    protected ConfigurationDescriptors configurations;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityModelId() {
        return entityModelId;
    }

    /**
     * Sets the value of the entityModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityModelId(String value) {
        this.entityModelId = value;
    }

    /**
     * Gets the value of the entityCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityCapabilities() {
        return entityCapabilities;
    }

    /**
     * Sets the value of the entityCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityCapabilities(String value) {
        this.entityCapabilities = value;
    }

    /**
     * Gets the value of the talkerStreamSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkerStreamSources() {
        return talkerStreamSources;
    }

    /**
     * Sets the value of the talkerStreamSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkerStreamSources(String value) {
        this.talkerStreamSources = value;
    }

    /**
     * Gets the value of the talkerCapabilties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkerCapabilties() {
        return talkerCapabilties;
    }

    /**
     * Sets the value of the talkerCapabilties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkerCapabilties(String value) {
        this.talkerCapabilties = value;
    }

    /**
     * Gets the value of the listenerStreamSinks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerStreamSinks() {
        return listenerStreamSinks;
    }

    /**
     * Sets the value of the listenerStreamSinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerStreamSinks(String value) {
        this.listenerStreamSinks = value;
    }

    /**
     * Gets the value of the listenerCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerCapabilities() {
        return listenerCapabilities;
    }

    /**
     * Sets the value of the listenerCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerCapabilities(String value) {
        this.listenerCapabilities = value;
    }

    /**
     * Gets the value of the controllerCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerCapabilities() {
        return controllerCapabilities;
    }

    /**
     * Sets the value of the controllerCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerCapabilities(String value) {
        this.controllerCapabilities = value;
    }

    /**
     * Gets the value of the associationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * Sets the value of the associationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationId(String value) {
        this.associationId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public LocalizedStringContainer getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public void setVendorName(LocalizedStringContainer value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public LocalizedStringContainer getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedStringContainer }
     *     
     */
    public void setModelName(LocalizedStringContainer value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the currentConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentConfiguration() {
        return currentConfiguration;
    }

    /**
     * Sets the value of the currentConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentConfiguration(String value) {
        this.currentConfiguration = value;
    }

    /**
     * Gets the value of the configurations property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDescriptors }
     *     
     */
    public ConfigurationDescriptors getConfigurations() {
        return configurations;
    }

    /**
     * Sets the value of the configurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDescriptors }
     *     
     */
    public void setConfigurations(ConfigurationDescriptors value) {
        this.configurations = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
