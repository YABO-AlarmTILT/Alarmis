
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="listContactParam" type="{com.alarmtilt.webservice.soap.res.v3}listContactParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContact", propOrder = {
    "authParam",
    "listContactParam"
})
public class ListContact {

    protected AuthParam authParam;
    protected ListContactParam listContactParam;

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
     * Gets the value of the listContactParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactParam }
     *     
     */
    public ListContactParam getListContactParam() {
        return listContactParam;
    }

    /**
     * Sets the value of the listContactParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactParam }
     *     
     */
    public void setListContactParam(ListContactParam value) {
        this.listContactParam = value;
    }

}
