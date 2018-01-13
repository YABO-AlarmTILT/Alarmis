
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listContactResult" type="{com.alarmtilt.webservice.soap.res.v3}listContactResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactResponse", propOrder = {
    "listContactResult"
})
public class ListContactResponse {

    protected ListContactResult listContactResult;

    /**
     * Gets the value of the listContactResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactResult }
     *     
     */
    public ListContactResult getListContactResult() {
        return listContactResult;
    }

    /**
     * Sets the value of the listContactResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactResult }
     *     
     */
    public void setListContactResult(ListContactResult value) {
        this.listContactResult = value;
    }

}
