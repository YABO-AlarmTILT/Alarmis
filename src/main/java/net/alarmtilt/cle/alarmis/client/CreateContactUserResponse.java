
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContactUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContactUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createContactUserResult" type="{com.alarmtilt.webservice.soap.res.v3}createContactUserResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContactUserResponse", propOrder = {
    "createContactUserResult"
})
public class CreateContactUserResponse {

    protected CreateContactUserResult createContactUserResult;

    /**
     * Gets the value of the createContactUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactUserResult }
     *     
     */
    public CreateContactUserResult getCreateContactUserResult() {
        return createContactUserResult;
    }

    /**
     * Sets the value of the createContactUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactUserResult }
     *     
     */
    public void setCreateContactUserResult(CreateContactUserResult value) {
        this.createContactUserResult = value;
    }

}
