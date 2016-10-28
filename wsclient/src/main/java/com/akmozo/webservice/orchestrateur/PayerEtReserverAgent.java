
package com.akmozo.webservice.orchestrateur;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.akmozo.webservice.concierges.DetailsReservation;
import com.akmozo.webservice.paiement.DonneesPaiement;


/**
 * <p>Classe Java pour payerEtReserverAgent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="payerEtReserverAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://paiement.webservice.akmozo.com/}donneesPaiement" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://concierges.webservice.akmozo.com/}detailsReservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payerEtReserverAgent", propOrder = {
    "arg0",
    "arg1"
})
public class PayerEtReserverAgent {

    protected DonneesPaiement arg0;
    protected DetailsReservation arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link DonneesPaiement }
     *     
     */
    public DonneesPaiement getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesPaiement }
     *     
     */
    public void setArg0(DonneesPaiement value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link DetailsReservation }
     *     
     */
    public DetailsReservation getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailsReservation }
     *     
     */
    public void setArg1(DetailsReservation value) {
        this.arg1 = value;
    }

}
