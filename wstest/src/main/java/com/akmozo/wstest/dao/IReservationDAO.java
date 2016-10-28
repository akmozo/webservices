package com.akmozo.wstest.dao;

import com.akmozo.wstest.entity.Reservation;
import javax.ejb.Local;

@Local
public interface IReservationDAO {
    
    public Reservation addReservation(Reservation paramReservation);
    public Reservation getReservation(int paramReservationId);
    
}
