package com.akmozo.ws.paiement;

import com.akmozo.ws.entity.DonneesPaiement;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * @author akmozo
 * @version 0.0.1, 13 oct. 2016
 */
@Stateless
@WebService(endpointInterface = "com.akmozo.ws.paiement.IPaiement")
public class Paiement implements IPaiement {

    @Override
    public long payer(DonneesPaiement paramDonneesPaiement) {
        
        return 123456789987456l;
        
    }

}
