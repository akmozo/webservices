/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akmozo.ws.entity;

import java.io.Serializable;

/**
 * @author akmozo
 * @version 0.0.1, 13 oct. 2016
 */
public class Agent implements Serializable {
    
    private int id;
    private String nom;
    private String prenom;
    private String ville;
    private String tel;
    private String email;

    public Agent() {
    }

    public Agent(int paramId, String paramNom, String paramPrenom, String paramVille, String paramTel, String paramEmail) {
        this.id = paramId;
        this.nom = paramNom;
        this.prenom = paramPrenom;
        this.ville = paramVille;
        this.tel = paramTel;
        this.email = paramEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int paramId) {
        this.id = paramId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        this.nom = paramNom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String paramPrenom) {
        this.prenom = paramPrenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String paramVille) {
        this.ville = paramVille;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String paramTel) {
        this.tel = paramTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String paramEmail) {
        this.email = paramEmail;
    }

}
