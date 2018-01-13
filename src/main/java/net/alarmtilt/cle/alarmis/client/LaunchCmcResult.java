
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchCmcResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchCmcResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmcInstance" type="{com.alarmtilt.webservice.soap.res.v3}cmcInstance" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}launchCmcResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchCmcResult", propOrder = {
    "cmcInstance",
    "result"
})
public class LaunchCmcResult {

    protected CmcInstance cmcInstance;
    protected LaunchCmcResultEnum result;

    /**
     * Gets the value of the cmcInstance property.
     * 
     * @return
     *     possible object is
     *     {@link CmcInstance }
     *     
     */
    public CmcInstance getCmcInstance() {
        return cmcInstance;
    }

    /**
     * Sets the value of the cmcInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmcInstance }
     *     
     */
    public void setCmcInstance(CmcInstance value) {
        this.cmcInstance = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchCmcResultEnum }
     *     
     */
    public LaunchCmcResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchCmcResultEnum }
     *     
     */
    public void setResult(LaunchCmcResultEnum value) {
        this.result = value;
    }

}
