
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="listCmcDefinitionParam" type="{com.alarmtilt.webservice.soap.res.v3}listCmcDefinitionParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcDefinition", propOrder = {
    "authParam",
    "listCmcDefinitionParam"
})
public class ListCmcDefinition {

    protected AuthParam authParam;
    protected ListCmcDefinitionParam listCmcDefinitionParam;

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
     * Gets the value of the listCmcDefinitionParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListCmcDefinitionParam }
     *     
     */
    public ListCmcDefinitionParam getListCmcDefinitionParam() {
        return listCmcDefinitionParam;
    }

    /**
     * Sets the value of the listCmcDefinitionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCmcDefinitionParam }
     *     
     */
    public void setListCmcDefinitionParam(ListCmcDefinitionParam value) {
        this.listCmcDefinitionParam = value;
    }

}
