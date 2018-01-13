
package net.alarmtilt.cle.alarmis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactAttributeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactAttributeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactAttributeVariables" type="{com.alarmtilt.webservice.soap.res.v3}contactAttributeVariable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}listContactAttributeResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactAttributeResult", propOrder = {
    "contactAttributeVariables",
    "result"
})
public class ListContactAttributeResult {

    @XmlElement(nillable = true)
    protected List<ContactAttributeVariable> contactAttributeVariables;
    protected ListContactAttributeResultEnum result;

    /**
     * Gets the value of the contactAttributeVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAttributeVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAttributeVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactAttributeVariable }
     * 
     * 
     */
    public List<ContactAttributeVariable> getContactAttributeVariables() {
        if (contactAttributeVariables == null) {
            contactAttributeVariables = new ArrayList<ContactAttributeVariable>();
        }
        return this.contactAttributeVariables;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactAttributeResultEnum }
     *     
     */
    public ListContactAttributeResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactAttributeResultEnum }
     *     
     */
    public void setResult(ListContactAttributeResultEnum value) {
        this.result = value;
    }

}
