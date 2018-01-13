
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcInstanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcInstanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listCmcInstanceResult" type="{com.alarmtilt.webservice.soap.res.v3}listCmcInstanceResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcInstanceResponse", propOrder = {
    "listCmcInstanceResult"
})
public class ListCmcInstanceResponse {

    protected ListCmcInstanceResult listCmcInstanceResult;

    /**
     * Gets the value of the listCmcInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListCmcInstanceResult }
     *     
     */
    public ListCmcInstanceResult getListCmcInstanceResult() {
        return listCmcInstanceResult;
    }

    /**
     * Sets the value of the listCmcInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCmcInstanceResult }
     *     
     */
    public void setListCmcInstanceResult(ListCmcInstanceResult value) {
        this.listCmcInstanceResult = value;
    }

}
