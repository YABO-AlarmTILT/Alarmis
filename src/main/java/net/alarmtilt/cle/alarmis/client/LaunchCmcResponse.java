
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchCmcResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchCmcResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="launchCmcResult" type="{com.alarmtilt.webservice.soap.res.v3}launchCmcResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchCmcResponse", propOrder = {
    "launchCmcResult"
})
public class LaunchCmcResponse {

    protected LaunchCmcResult launchCmcResult;

    /**
     * Gets the value of the launchCmcResult property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchCmcResult }
     *     
     */
    public LaunchCmcResult getLaunchCmcResult() {
        return launchCmcResult;
    }

    /**
     * Sets the value of the launchCmcResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchCmcResult }
     *     
     */
    public void setLaunchCmcResult(LaunchCmcResult value) {
        this.launchCmcResult = value;
    }

}
