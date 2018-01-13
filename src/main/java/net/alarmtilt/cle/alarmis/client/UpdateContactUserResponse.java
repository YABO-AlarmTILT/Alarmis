
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateContactUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateContactUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateContactUserResult" type="{com.alarmtilt.webservice.soap.res.v3}updateContactUserResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateContactUserResponse", propOrder = {
    "updateContactUserResult"
})
public class UpdateContactUserResponse {

    protected UpdateContactUserResult updateContactUserResult;

    /**
     * Gets the value of the updateContactUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContactUserResult }
     *     
     */
    public UpdateContactUserResult getUpdateContactUserResult() {
        return updateContactUserResult;
    }

    /**
     * Sets the value of the updateContactUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContactUserResult }
     *     
     */
    public void setUpdateContactUserResult(UpdateContactUserResult value) {
        this.updateContactUserResult = value;
    }

}
