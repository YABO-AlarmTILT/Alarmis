
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcDefinitionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcDefinitionParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmcDefinitionFilter" type="{com.alarmtilt.webservice.soap.res.v3}cmcDefinitionFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcDefinitionParam", propOrder = {
    "cmcDefinitionFilter"
})
public class ListCmcDefinitionParam {

    protected CmcDefinitionFilter cmcDefinitionFilter;

    /**
     * Gets the value of the cmcDefinitionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CmcDefinitionFilter }
     *     
     */
    public CmcDefinitionFilter getCmcDefinitionFilter() {
        return cmcDefinitionFilter;
    }

    /**
     * Sets the value of the cmcDefinitionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmcDefinitionFilter }
     *     
     */
    public void setCmcDefinitionFilter(CmcDefinitionFilter value) {
        this.cmcDefinitionFilter = value;
    }

}
