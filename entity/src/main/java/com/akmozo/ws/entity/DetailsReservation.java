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
public class DetailsReservation implements Serializable  {
    
    private Date dateHeureEntree;
    private Date dateHeureSortie;
    private String villeLogement;
    private String adresseLogement;
    private String nomClient;
    private String prenomClient;
    private String emailClient;
    private String nomHote;
    private String prenomHote;
    private String emailHote;

    public DetailsReservation() {
    }

    public DetailsReservation(Date paramDateHeureEntree, Date paramDateHeureSortie, String paramVilleLogement, String paramAdresseLogement, String paramNomClient, String paramPrenomClient, String paramEmailClient, String paramNomHote, String paramPrenomHote, String paramEmailHote) {
        this.dateHeureEntree = paramDateHeureEntree;
        this.dateHeureSortie = paramDateHeureSortie;
        this.villeLogement = paramVilleLogement;
        this.adresseLogement = paramAdresseLogement;
        this.nomClient = paramNomClient;
        this.prenomClient = paramPrenomClient;
        this.emailClient = paramEmailClient;
        this.nomHote = paramNomHote;
        this.prenomHote = paramPrenomHote;
        this.emailHote = paramEmailHote;
    }

    public Date getDateHeureEntree() {
        return dateHeureEntree;
    }

    public void setDateHeureEntree(Date paramDateHeureEntree) {
        this.dateHeureEntree = paramDateHeureEntree;
    }

    public Date getDateHeureSortie() {
        return dateHeureSortie;
    }

    public void setDateHeureSortie(Date paramDateHeureSortie) {
        this.dateHeureSortie = paramDateHeureSortie;
    }

    public String getVilleLogement() {
        return villeLogement;
    }

    public void setVilleLogement(String paramVilleLogement) {
        this.villeLogement = paramVilleLogement;
    }

    public String getAdresseLogement() {
        return adresseLogement;
    }

    public void setAdresseLogement(String paramAdresseLogement) {
        this.adresseLogement = paramAdresseLogement;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String paramNomClient) {
        this.nomClient = paramNomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String paramPrenomClient) {
        this.prenomClient = paramPrenomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String paramEmailClient) {
        this.emailClient = paramEmailClient;
    }

    public String getNomHote() {
        return nomHote;
    }

    public void setNomHote(String paramNomHote) {
        this.nomHote = paramNomHote;
    }

    public String getPrenomHote() {
        return prenomHote;
    }

    public void setPrenomHote(String paramPrenomHote) {
        this.prenomHote = paramPrenomHote;
    }

    public String getEmailHote() {
        return emailHote;
    }

    public void setEmailHote(String paramEmailHote) {
        this.emailHote = paramEmailHote;
    }

}
