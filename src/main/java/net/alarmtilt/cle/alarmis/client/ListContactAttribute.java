
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="listContactAttributeParam" type="{com.alarmtilt.webservice.soap.res.v3}listContactAttributeParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactAttribute", propOrder = {
    "authParam",
    "listContactAttributeParam"
})
public class ListContactAttribute {

    protected AuthParam authParam;
    protected ListContactAttributeParam listContactAttributeParam;

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
     * Gets the value of the listContactAttributeParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactAttributeParam }
     *     
     */
    public ListContactAttributeParam getListContactAttributeParam() {
        return listContactAttributeParam;
    }

    /**
     * Sets the value of the listContactAttributeParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactAttributeParam }
     *     
     */
    public void setListContactAttributeParam(ListContactAttributeParam value) {
        this.listContactAttributeParam = value;
    }

}
