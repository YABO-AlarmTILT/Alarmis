
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="listCmcInstanceParam" type="{com.alarmtilt.webservice.soap.res.v3}listCmcInstanceParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcInstance", propOrder = {
    "authParam",
    "listCmcInstanceParam"
})
public class ListCmcInstance {

    protected AuthParam authParam;
    protected ListCmcInstanceParam listCmcInstanceParam;

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
     * Gets the value of the listCmcInstanceParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListCmcInstanceParam }
     *     
     */
    public ListCmcInstanceParam getListCmcInstanceParam() {
        return listCmcInstanceParam;
    }

    /**
     * Sets the value of the listCmcInstanceParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCmcInstanceParam }
     *     
     */
    public void setListCmcInstanceParam(ListCmcInstanceParam value) {
        this.listCmcInstanceParam = value;
    }

}
