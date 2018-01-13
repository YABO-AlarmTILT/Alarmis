
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchCmc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchCmc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/>
 *         &lt;element name="launchCmcParam" type="{com.alarmtilt.webservice.soap.res.v3}launchCmcParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchCmc", propOrder = {
    "authParam",
    "launchCmcParam"
})
public class LaunchCmc {

    protected AuthParam authParam;
    protected LaunchCmcParam launchCmcParam;

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
     * Gets the value of the launchCmcParam property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchCmcParam }
     *     
     */
    public LaunchCmcParam getLaunchCmcParam() {
        return launchCmcParam;
    }

    /**
     * Sets the value of the launchCmcParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchCmcParam }
     *     
     */
    public void setLaunchCmcParam(LaunchCmcParam value) {
        this.launchCmcParam = value;
    }

}
