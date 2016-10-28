
package com.akmozo.webservice.concierges;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour detailsReservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailsReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseLogement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateHeureEntree" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateHeureSortie" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emailClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailHote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomHote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomHote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villeLogement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailsReservation", propOrder = {
    "adresseLogement",
    "dateHeureEntree",
    "dateHeureSortie",
    "emailClient",
    "emailHote",
    "nomClient",
    "nomHote",
    "prenomClient",
    "prenomHote",
    "villeLogement"
})
public class DetailsReservation {

    protected String adresseLogement;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateHeureEntree;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateHeureSortie;
    protected String emailClient;
    protected String emailHote;
    protected String nomClient;
    protected String nomHote;
    protected String prenomClient;
    protected String prenomHote;
    protected String villeLogement;

    /**
     * Obtient la valeur de la propriété adresseLogement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLogement() {
        return adresseLogement;
    }

    /**
     * Définit la valeur de la propriété adresseLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLogement(String value) {
        this.adresseLogement = value;
    }

    /**
     * Obtient la valeur de la propriété dateHeureEntree.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateHeureEntree() {
        return dateHeureEntree;
    }

    /**
     * Définit la valeur de la propriété dateHeureEntree.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateHeureEntree(XMLGregorianCalendar value) {
        this.dateHeureEntree = value;
    }

    /**
     * Obtient la valeur de la propriété dateHeureSortie.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateHeureSortie() {
        return dateHeureSortie;
    }

    /**
     * Définit la valeur de la propriété dateHeureSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateHeureSortie(XMLGregorianCalendar value) {
        this.dateHeureSortie = value;
    }

    /**
     * Obtient la valeur de la propriété emailClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * Définit la valeur de la propriété emailClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailClient(String value) {
        this.emailClient = value;
    }

    /**
     * Obtient la valeur de la propriété emailHote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailHote() {
        return emailHote;
    }

    /**
     * Définit la valeur de la propriété emailHote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailHote(String value) {
        this.emailHote = value;
    }

    /**
     * Obtient la valeur de la propriété nomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Définit la valeur de la propriété nomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

    /**
     * Obtient la valeur de la propriété nomHote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHote() {
        return nomHote;
    }

    /**
     * Définit la valeur de la propriété nomHote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHote(String value) {
        this.nomHote = value;
    }

    /**
     * Obtient la valeur de la propriété prenomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomClient() {
        return prenomClient;
    }

    /**
     * Définit la valeur de la propriété prenomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomClient(String value) {
        this.prenomClient = value;
    }

    /**
     * Obtient la valeur de la propriété prenomHote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomHote() {
        return prenomHote;
    }

    /**
     * Définit la valeur de la propriété prenomHote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomHote(String value) {
        this.prenomHote = value;
    }

    /**
     * Obtient la valeur de la propriété villeLogement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleLogement() {
        return villeLogement;
    }

    /**
     * Définit la valeur de la propriété villeLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleLogement(String value) {
        this.villeLogement = value;
    }

}
