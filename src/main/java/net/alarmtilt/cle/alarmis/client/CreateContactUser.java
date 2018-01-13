
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContactUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContactUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="createContactUserParam" type="{com.alarmtilt.webservice.soap.res.v3}createContactUserParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContactUser", propOrder = {
    "authParam",
    "createContactUserParam"
})
public class CreateContactUser {

    protected AuthParam authParam;
    protected CreateContactUserParam createContactUserParam;

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
     * Gets the value of the createContactUserParam property.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactUserParam }
     *     
     */
    public CreateContactUserParam getCreateContactUserParam() {
        return createContactUserParam;
    }

    /**
     * Sets the value of the createContactUserParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactUserParam }
     *     
     */
    public void setCreateContactUserParam(CreateContactUserParam value) {
        this.createContactUserParam = value;
    }

}
