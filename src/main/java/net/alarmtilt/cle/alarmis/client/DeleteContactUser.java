
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="deleteContactUserParam" type="{com.alarmtilt.webservice.soap.res.v3}deleteContactUserParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContactUser", propOrder = {
    "authParam",
    "deleteContactUserParam"
})
public class DeleteContactUser {

    protected AuthParam authParam;
    protected DeleteContactUserParam deleteContactUserParam;

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
     * Gets the value of the deleteContactUserParam property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteContactUserParam }
     *     
     */
    public DeleteContactUserParam getDeleteContactUserParam() {
        return deleteContactUserParam;
    }

    /**
     * Sets the value of the deleteContactUserParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteContactUserParam }
     *     
     */
    public void setDeleteContactUserParam(DeleteContactUserParam value) {
        this.deleteContactUserParam = value;
    }

}
