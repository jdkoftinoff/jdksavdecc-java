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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodePlotList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodePlotList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bode_plot" type="{http://grouper.ieee.org/groups/1722/1/contributions/xml}BodePlot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodePlotList", propOrder = {
    "bodePlot"
})
public class BodePlotList {

    @XmlElement(name = "bode_plot")
    protected List<BodePlot> bodePlot;

    /**
     * Gets the value of the bodePlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodePlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodePlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodePlot }
     * 
     * 
     */
    public List<BodePlot> getBodePlot() {
        if (bodePlot == null) {
            bodePlot = new ArrayList<BodePlot>();
        }
        return this.bodePlot;
    }

}
