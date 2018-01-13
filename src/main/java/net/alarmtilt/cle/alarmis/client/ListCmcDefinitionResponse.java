
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcDefinitionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listCmcDefinitionResult" type="{com.alarmtilt.webservice.soap.res.v3}listCmcDefinitionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcDefinitionResponse", propOrder = {
    "listCmcDefinitionResult"
})
public class ListCmcDefinitionResponse {

    protected ListCmcDefinitionResult listCmcDefinitionResult;

    /**
     * Gets the value of the listCmcDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListCmcDefinitionResult }
     *     
     */
    public ListCmcDefinitionResult getListCmcDefinitionResult() {
        return listCmcDefinitionResult;
    }

    /**
     * Sets the value of the listCmcDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCmcDefinitionResult }
     *     
     */
    public void setListCmcDefinitionResult(ListCmcDefinitionResult value) {
        this.listCmcDefinitionResult = value;
    }

}
