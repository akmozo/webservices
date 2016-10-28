
package com.akmozo.webservice.paiement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour donneesPaiement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="donneesPaiement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccvCarte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateExpirationCarte" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nomDetenteurCarte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCarte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donneesPaiement", propOrder = {
    "ccvCarte",
    "dateExpirationCarte",
    "montant",
    "nomDetenteurCarte",
    "numeroCarte"
})
public class DonneesPaiement {

    protected String ccvCarte;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpirationCarte;
    protected double montant;
    protected String nomDetenteurCarte;
    protected String numeroCarte;

    /**
     * Obtient la valeur de la propriété ccvCarte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcvCarte() {
        return ccvCarte;
    }

    /**
     * Définit la valeur de la propriété ccvCarte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcvCarte(String value) {
        this.ccvCarte = value;
    }

    /**
     * Obtient la valeur de la propriété dateExpirationCarte.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpirationCarte() {
        return dateExpirationCarte;
    }

    /**
     * Définit la valeur de la propriété dateExpirationCarte.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpirationCarte(XMLGregorianCalendar value) {
        this.dateExpirationCarte = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété nomDetenteurCarte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDetenteurCarte() {
        return nomDetenteurCarte;
    }

    /**
     * Définit la valeur de la propriété nomDetenteurCarte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDetenteurCarte(String value) {
        this.nomDetenteurCarte = value;
    }

    /**
     * Obtient la valeur de la propriété numeroCarte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarte() {
        return numeroCarte;
    }

    /**
     * Définit la valeur de la propriété numeroCarte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarte(String value) {
        this.numeroCarte = value;
    }

}
