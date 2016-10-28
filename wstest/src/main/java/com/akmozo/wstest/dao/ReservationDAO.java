package com.akmozo.wstest.dao;

import com.akmozo.wstest.entity.Agent;
import com.akmozo.wstest.entity.Reservation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ReservationDAO implements IReservationDAO {

    @PersistenceContext(unitName = "restoPU")
    EntityManager entityManager;
 
    @Override
    public Reservation addReservation(Reservation paramReservation) {
        
        Agent agent = entityManager.find(Agent.class, paramReservation.getAgent().getId());
        
        entityManager.persist(agent);
        entityManager.persist(paramReservation);
        
        return paramReservation;
    }

    @Override
    public Reservation getReservation(int paramReservationId) {
        return entityManager.find(Reservation.class, paramReservationId);
    }

}
