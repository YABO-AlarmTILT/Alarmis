
package net.alarmtilt.cle.alarmis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCmcInstanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCmcInstanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" type="{com.alarmtilt.webservice.soap.res.v3}cmcInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}listCmcInstanceResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCmcInstanceResult", propOrder = {
    "list",
    "result"
})
public class ListCmcInstanceResult {

    @XmlElement(nillable = true)
    protected List<CmcInstance> list;
    protected ListCmcInstanceResultEnum result;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmcInstance }
     * 
     * 
     */
    public List<CmcInstance> getList() {
        if (list == null) {
            list = new ArrayList<CmcInstance>();
        }
        return this.list;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ListCmcInstanceResultEnum }
     *     
     */
    public ListCmcInstanceResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCmcInstanceResultEnum }
     *     
     */
    public void setResult(ListCmcInstanceResultEnum value) {
        this.result = value;
    }

}
