package com.akmozo.ws.conciergerie;

import com.akmozo.ws.entity.Agent;
import com.akmozo.ws.entity.DetailsReservation;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
import javax.jws.WebService;

/**
 *
 * @author stagiaire
 */
@Remote
@WebService
public interface IConciergerie {
    
    public List<Agent> rechercherAgents(Date paramDate, String paramVille);
    
    public boolean reserverAgent(Agent paramAgent, DetailsReservation paramDetailsReservation);
    
}
