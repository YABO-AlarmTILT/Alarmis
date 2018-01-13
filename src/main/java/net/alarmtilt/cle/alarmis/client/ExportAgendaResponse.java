
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAgendaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportAgendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exportAgendaResult" type="{com.alarmtilt.webservice.soap.res.v3}exportAgendaResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAgendaResponse", propOrder = {
    "exportAgendaResult"
})
public class ExportAgendaResponse {

    protected ExportAgendaResult exportAgendaResult;

    /**
     * Gets the value of the exportAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExportAgendaResult }
     *     
     */
    public ExportAgendaResult getExportAgendaResult() {
        return exportAgendaResult;
    }

    /**
     * Sets the value of the exportAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAgendaResult }
     *     
     */
    public void setExportAgendaResult(ExportAgendaResult value) {
        this.exportAgendaResult = value;
    }

}
