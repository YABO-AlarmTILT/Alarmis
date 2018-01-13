
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listContactUserResult" type="{com.alarmtilt.webservice.soap.res.v3}listContactUserResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactUserResponse", propOrder = {
    "listContactUserResult"
})
public class ListContactUserResponse {

    protected ListContactUserResult listContactUserResult;

    /**
     * Gets the value of the listContactUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactUserResult }
     *     
     */
    public ListContactUserResult getListContactUserResult() {
        return listContactUserResult;
    }

    /**
     * Sets the value of the listContactUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactUserResult }
     *     
     */
    public void setListContactUserResult(ListContactUserResult value) {
        this.listContactUserResult = value;
    }

}
