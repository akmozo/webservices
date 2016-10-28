package com.akmozo.ws.orchestrateur;

import com.akmozo.ws.conciergerie.Agent;
import com.akmozo.ws.conciergerie.ConciergerieService;
import com.akmozo.ws.conciergerie.DetailsReservation;
import com.akmozo.ws.conciergerie.IConciergerie;
import com.akmozo.ws.paiement.DonneesPaiement;
import com.akmozo.ws.paiement.IPaiement;
import com.akmozo.ws.paiement.PaiementService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author akmozo
 * @version 0.0.1, 13 oct. 2016
 */
@Stateless
@WebService(
        endpointInterface = "com.akmozo.ws.orchestrateur.IOrchestrateur"
)
public class Orchestrateur implements IOrchestrateur {

    private String paiementURL = "";
    private String conciergerieURL = "";
    
    /**
     * get ws urls from JBOSS/standalone/data/urls.properties
     */
    public void getWebServicesURLs(){
        
        // path : JBOSS/standalone/data/urls.properties
        String path = System.getProperty("jboss.server.data.dir") + "/" + "urls.properties";
        
        System.err.println("--------------------");
        System.err.println("--------------------");
        
        System.err.println("path : " + path);
        
        System.err.println("--------------------");
        System.err.println("--------------------");
        
        Properties props = new Properties();
        
        try {            
            InputStream inputStream = new FileInputStream(path);
            props.load(inputStream);            
            paiementURL = props.getProperty("url.paiement");
            conciergerieURL = props.getProperty("url.conciergerie");            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orchestrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orchestrateur.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    @Override
    public boolean payerEtReserverAgent(DonneesPaiement paramDonneesPaiement, DetailsReservation paramDetailsReservation) {

        getWebServicesURLs();
        
        try {

            URL url = new URL(paiementURL);

            IPaiement paiementService = new PaiementService(url).getPaiementPort();

            GregorianCalendar gd = new GregorianCalendar();
            gd.setTime(new Date());
            XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gd);

            /*
                DonneesPaiement donneesPaiement = new DonneesPaiement();
                donneesPaiement.setCcvCarte("123");
                donneesPaiement.setDateExpirationCarte(xgc);
                donneesPaiement.setMontant(805.5);
                donneesPaiement.setNomDetenteurCarte("nom prenom");
                donneesPaiement.setNumeroCarte("1234567812345678");
            */

            //System.err.println("Paiement  : " + paiementService.payer(donneesPaiement));

            if (paiementService.payer(paramDonneesPaiement) != 0) {
                
                IConciergerie conciergeService = new ConciergerieService(new URL(conciergerieURL)).getConciergeriePort();
                List<Agent> agentsDisponibles = conciergeService.rechercherAgents(xgc, "Paris");

                if (agentsDisponibles.size() > 0) {

                    Agent agentAReserver = agentsDisponibles.get(0);

                    /*
                        DetailsReservation detailsReservation = new DetailsReservation();
                        detailsReservation.setAdresseLogement("12 rue de liberte");
                        detailsReservation.setDateHeureEntree(xgc);
                        detailsReservation.setDateHeureSortie(xgc);
                        detailsReservation.setEmailClient("email@client");
                        detailsReservation.setEmailHote("email@hote");
                        detailsReservation.setNomClient("nomClient");
                        detailsReservation.setNomHote("nomHote");
                        detailsReservation.setPrenomClient("prenomClient");
                        detailsReservation.setPrenomHote("prenomHote");
                        detailsReservation.setVilleLogement("Paris");
                    */

                    if (conciergeService.reserverAgent(agentAReserver, paramDetailsReservation)) {
                        System.err.println("Agent reservé avec succées");                        
                        return true;
                    }
                }
            }
        } catch (MalformedURLException | DatatypeConfigurationException ex) {
            System.out.printf("Caught Exception: %s\n", ex.getMessage());
            return false;
        }
        
        return false;

    }

}
