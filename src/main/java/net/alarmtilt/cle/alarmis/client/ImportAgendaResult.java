
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importAgendaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importAgendaResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}importAgendaResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importAgendaResult", propOrder = {
    "result"
})
public class ImportAgendaResult {

    protected ImportAgendaResultEnum result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ImportAgendaResultEnum }
     *     
     */
    public ImportAgendaResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportAgendaResultEnum }
     *     
     */
    public void setResult(ImportAgendaResultEnum value) {
        this.result = value;
    }

}
