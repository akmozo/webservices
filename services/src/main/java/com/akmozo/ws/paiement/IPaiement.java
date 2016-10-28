package com.akmozo.ws.paiement;

import com.akmozo.ws.entity.DonneesPaiement;
import javax.ejb.Remote;
import javax.jws.WebService;

/**
 *
 * @author stagiaire
 */
@Remote
@WebService
public interface IPaiement {
    
    public long payer(DonneesPaiement paramDonneesPaiement);
    //public long payer(double montant);
    
}
