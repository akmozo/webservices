package com.akmozo.wstest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlTransient
    private Integer id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateReservation; 
    private String ville;
    @ManyToOne
    //@XmlTransient
    private Agent agent;

    public Reservation() {
    }

    public Reservation(Integer paramId, Date paramDateReservation) {
        this.id = paramId;
        this.dateReservation = paramDateReservation;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date paramDateReservation) {
        this.dateReservation = paramDateReservation;
    }        

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent paramAgent) {
        this.agent = paramAgent;
    }
    
}
