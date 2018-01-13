
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchProcedureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="launchProcedureResult" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchProcedureResponse", propOrder = {
    "launchProcedureResult"
})
public class LaunchProcedureResponse {

    protected LaunchProcedureResult launchProcedureResult;

    /**
     * Gets the value of the launchProcedureResult property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchProcedureResult }
     *     
     */
    public LaunchProcedureResult getLaunchProcedureResult() {
        return launchProcedureResult;
    }

    /**
     * Sets the value of the launchProcedureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchProcedureResult }
     *     
     */
    public void setLaunchProcedureResult(LaunchProcedureResult value) {
        this.launchProcedureResult = value;
    }

}
