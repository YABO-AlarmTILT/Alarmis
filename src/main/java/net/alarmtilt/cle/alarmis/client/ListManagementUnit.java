
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listManagementUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listManagementUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="listManagementUnitParam" type="{com.alarmtilt.webservice.soap.res.v3}listManagementUnitParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listManagementUnit", propOrder = {
    "authParam",
    "listManagementUnitParam"
})
public class ListManagementUnit {

    protected AuthParam authParam;
    protected ListManagementUnitParam listManagementUnitParam;

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
     * Gets the value of the listManagementUnitParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListManagementUnitParam }
     *     
     */
    public ListManagementUnitParam getListManagementUnitParam() {
        return listManagementUnitParam;
    }

    /**
     * Sets the value of the listManagementUnitParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListManagementUnitParam }
     *     
     */
    public void setListManagementUnitParam(ListManagementUnitParam value) {
        this.listManagementUnitParam = value;
    }

}
