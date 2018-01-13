
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateContactUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateContactUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="updateContactUserParam" type="{com.alarmtilt.webservice.soap.res.v3}updateContactUserParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateContactUser", propOrder = {
    "authParam",
    "updateContactUserParam"
})
public class UpdateContactUser {

    protected AuthParam authParam;
    protected UpdateContactUserParam updateContactUserParam;

    /**
     * Gets the value of the authParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthParam }
     *     
     */
    public AuthParam getAuthParam() {
        return authParam;
    }

    /**
     * Sets the value of the authParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthParam }
     *     
     */
    public void setAuthParam(AuthParam value) {
        this.authParam = value;
    }

    /**
     * Gets the value of the updateContactUserParam property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContactUserParam }
     *     
     */
    public UpdateContactUserParam getUpdateContactUserParam() {
        return updateContactUserParam;
    }

    /**
     * Sets the value of the updateContactUserParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContactUserParam }
     *     
     */
    public void setUpdateContactUserParam(UpdateContactUserParam value) {
        this.updateContactUserParam = value;
    }

}
