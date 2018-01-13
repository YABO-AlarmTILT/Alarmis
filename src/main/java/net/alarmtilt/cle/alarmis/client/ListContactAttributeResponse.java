
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactAttributeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactAttributeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listContactAttributeResult" type="{com.alarmtilt.webservice.soap.res.v3}listContactAttributeResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactAttributeResponse", propOrder = {
    "listContactAttributeResult"
})
public class ListContactAttributeResponse {

    protected ListContactAttributeResult listContactAttributeResult;

    /**
     * Gets the value of the listContactAttributeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactAttributeResult }
     *     
     */
    public ListContactAttributeResult getListContactAttributeResult() {
        return listContactAttributeResult;
    }

    /**
     * Sets the value of the listContactAttributeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactAttributeResult }
     *     
     */
    public void setListContactAttributeResult(ListContactAttributeResult value) {
        this.listContactAttributeResult = value;
    }

}
