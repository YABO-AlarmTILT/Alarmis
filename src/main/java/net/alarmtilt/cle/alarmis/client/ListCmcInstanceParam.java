
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcInstanceParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcInstanceParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmcInstanceFilter" type="{com.alarmtilt.webservice.soap.res.v3}cmcInstanceFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcInstanceParam", propOrder = {
    "cmcInstanceFilter"
})
public class ListCmcInstanceParam {

    protected CmcInstanceFilter cmcInstanceFilter;

    /**
     * Gets the value of the cmcInstanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CmcInstanceFilter }
     *     
     */
    public CmcInstanceFilter getCmcInstanceFilter() {
        return cmcInstanceFilter;
    }

    /**
     * Sets the value of the cmcInstanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmcInstanceFilter }
     *     
     */
    public void setCmcInstanceFilter(CmcInstanceFilter value) {
        this.cmcInstanceFilter = value;
    }

}
