
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteContactUserResult" type="{com.alarmtilt.webservice.soap.res.v3}deleteContactUserResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContactUserResponse", propOrder = {
    "deleteContactUserResult"
})
public class DeleteContactUserResponse {

    protected DeleteContactUserResult deleteContactUserResult;

    /**
     * Gets the value of the deleteContactUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteContactUserResult }
     *     
     */
    public DeleteContactUserResult getDeleteContactUserResult() {
        return deleteContactUserResult;
    }

    /**
     * Sets the value of the deleteContactUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteContactUserResult }
     *     
     */
    public void setDeleteContactUserResult(DeleteContactUserResult value) {
        this.deleteContactUserResult = value;
    }

}
