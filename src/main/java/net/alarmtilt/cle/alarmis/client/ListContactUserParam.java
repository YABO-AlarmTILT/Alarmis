
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactUserParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dynamicSelection" type="{com.alarmtilt.webservice.soap.res.v3}contactDynamicSelection" minOccurs="0"/>
 *         &lt;element name="loadDetail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mode" type="{com.alarmtilt.webservice.soap.res.v3}listContactUserMode" minOccurs="0"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactUserParam", propOrder = {
    "dynamicSelection",
    "loadDetail",
    "mode",
    "pageIndex",
    "pageSize"
})
public class ListContactUserParam {

    protected ContactDynamicSelection dynamicSelection;
    protected Boolean loadDetail;
    protected ListContactUserMode mode;
    protected Integer pageIndex;
    protected Integer pageSize;

    /**
     * Gets the value of the dynamicSelection property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDynamicSelection }
     *     
     */
    public ContactDynamicSelection getDynamicSelection() {
        return dynamicSelection;
    }

    /**
     * Sets the value of the dynamicSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDynamicSelection }
     *     
     */
    public void setDynamicSelection(ContactDynamicSelection value) {
        this.dynamicSelection = value;
    }

    /**
     * Gets the value of the loadDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadDetail() {
        return loadDetail;
    }

    /**
     * Sets the value of the loadDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadDetail(Boolean value) {
        this.loadDetail = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactUserMode }
     *     
     */
    public ListContactUserMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactUserMode }
     *     
     */
    public void setMode(ListContactUserMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
