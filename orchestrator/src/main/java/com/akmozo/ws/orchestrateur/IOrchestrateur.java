package com.akmozo.ws.orchestrateur;

import com.akmozo.ws.conciergerie.DetailsReservation;
import com.akmozo.ws.paiement.DonneesPaiement;
import javax.ejb.Remote;
import javax.jws.WebService;

/**
 *
 * @author stagiaire
 */
@Remote
@WebService
public interface IOrchestrateur {
    
    public boolean payerEtReserverAgent(DonneesPaiement paramDonneesPaiement, DetailsReservation paramDetailsReservation);
    
}
