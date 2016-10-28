
package com.akmozo.wstest.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Agent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@XmlTransient
    @XmlElement(required = true)
    private Integer id;
    @XmlElement(required = false)
    private String nom;
    @XmlElement(required = false)
    private String prenom;
    @XmlElement(required = false)
    private String ville;
    @OneToMany(mappedBy = "agent", cascade = CascadeType.MERGE)
    @XmlTransient
    private List<Reservation> reservations;

    public Agent() {
    }

    public Agent(Integer paramId, String paramNom, String paramPrenom) {
        this.id = paramId;
        this.nom = paramNom;
        this.prenom = paramPrenom;
    }

    public Agent(String paramNom, String paramPrenom, String paramVille) {
        this.nom = paramNom;
        this.prenom = paramPrenom;
        this.ville = paramVille;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> paramReservations) {
        this.reservations = paramReservations;
    }
    
}
