/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akmozo.ws.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author akmozo
 * @version 0.0.1, 13 oct. 2016
 */
public class DonneesPaiement implements Serializable {

    private String numeroCarte;
    private String ccvCarte;
    private Date dateExpirationCarte;
    private String nomDetenteurCarte;
    private double montant;

    public DonneesPaiement() {
    }

    public DonneesPaiement(String paramNumeroCarte, String paramCcvCarte, Date paramDateExpirationCarte, String paramNomDetenteurCarte, double paramMontant) {
        this.numeroCarte = paramNumeroCarte;
        this.ccvCarte = paramCcvCarte;
        this.dateExpirationCarte = paramDateExpirationCarte;
        this.nomDetenteurCarte = paramNomDetenteurCarte;
        this.montant = paramMontant;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String paramNumeroCarte) {
        this.numeroCarte = paramNumeroCarte;
    }

    public String getCcvCarte() {
        return ccvCarte;
    }

    public void setCcvCarte(String paramCcvCarte) {
        this.ccvCarte = paramCcvCarte;
    }

    public Date getDateExpirationCarte() {
        return dateExpirationCarte;
    }

    public void setDateExpirationCarte(Date paramDateExpirationCarte) {
        this.dateExpirationCarte = paramDateExpirationCarte;
    }

    public String getNomDetenteurCarte() {
        return nomDetenteurCarte;
    }

    public void setNomDetenteurCarte(String paramNomDetenteurCarte) {
        this.nomDetenteurCarte = paramNomDetenteurCarte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double paramMontant) {
        this.montant = paramMontant;
    }
    
}
