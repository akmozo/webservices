/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akmozo.ws.orchestrateur;

import com.akmozo.ws.conciergerie.iservices.Agent;
import com.akmozo.ws.conciergerie.iservices.DetailsReservation;
import com.akmozo.ws.conciergerie.services.IServices;
import com.akmozo.ws.conciergerie.services.ServicesService;
import com.akmozo.ws.paiement.soap.DonneesPaiement;
import com.akmozo.ws.paiement.soap.PayerRequest;
import com.akmozo.ws.paiement.soap.PayerResponse;
import com.akmozo.ws.paiement.soap.PaymentsPort;
import com.akmozo.ws.paiement.soap.PaymentsPortService;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author stagiaire
 */
public class App {

    public static void main(String[] args) {

        String paiementURL = "http://192.168.102.62:8081/ws/soapws/payments.wsdl";
        String conciergeURL = "http://192.168.102.62:8080/wsc/Services?wsdl";

        try {

            URL url = new URL(paiementURL);
            
            PaymentsPort paiementService = new PaymentsPortService(url).getPaymentsPortSoap11();
            
            GregorianCalendar gd = new GregorianCalendar();
            gd.setTime(new Date());
            XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gd);

            DonneesPaiement donneesPaiement = new DonneesPaiement();
            donneesPaiement.setCcvCarte("250");
            donneesPaiement.setDateExpirationCarte("2017-11");
            donneesPaiement.setMontant(805.5);
            donneesPaiement.setNomDetenteurCarte("Durand");
            donneesPaiement.setNumeroCarte("1234567898765432");
            
            PayerRequest payerRequest = new PayerRequest();
            payerRequest.setDonneesPaiement(donneesPaiement);
            
            System.err.println("Paiement  : " + paiementService.payer(payerRequest).getTransactionNum());
            
            PayerResponse payerResponse = paiementService.payer(payerRequest);
            
            if(paiementService.payer(payerRequest).getTransactionNum() != 0){
                
                IServices conciergeService = new ServicesService(new URL(conciergeURL)).getServicesPort();    
                
                List<Agent> agentsDisponibles = conciergeService.rechercherAgents("Paris", xgc);
                        //.rechercherAgents(xgc, "Paris");
                
                if(agentsDisponibles.size() > 0){
                    
                    System.out.println("nb agents : " + agentsDisponibles.size());
                    
                    Agent agentAReserver = agentsDisponibles.get(0);
                    
                    System.err.println("--------------------------------");                    
                    System.err.println("agent : " + agentAReserver.getPrenom() + " " + agentAReserver.getNom());                    
                    System.err.println("--------------------------------");
                    
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
                    
                    if(conciergeService.reserverAgent(agentAReserver, detailsReservation)){
                        
                        System.err.println("Agent reservé avec succees");
                        
                    }
                    
                }
                
            }

            // paiement.payer(arg0)
        } catch (Exception ex) {
            System.out.printf("Caught Exception: %s\n", ex.getMessage());
        }

    }
    
    public static void main01(String[] args) {
/*
        String paiementURL = "http://localhost:80/api-0.1/Paiement?wsdl";
        String conciergeURL = "http://localhost:80/api-0.1/Concierge?wsdl";

        try {

            URL url = new URL(paiementURL);

            IPaiement paiementService = new PaiementService(url).getPaiementPort();
            
            GregorianCalendar gd = new GregorianCalendar();
            gd.setTime(new Date());
            XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gd);
            
            DonneesPaiement donneesPaiement = new DonneesPaiement();
            donneesPaiement.setCcvCarte("123");
            donneesPaiement.setDateExpirationCarte(xgc);
            donneesPaiement.setMontant(805.5);
            donneesPaiement.setNomDetenteurCarte("nom prenom");
            donneesPaiement.setNumeroCarte("1234567812345678");
            
            System.err.println("Paiement  : " + paiementService.payer(donneesPaiement));
            
            if(paiementService.payer(donneesPaiement) != 0){
                
                IConciergerie conciergeService = new ConciergerieService(new URL(conciergeURL)).getConciergeriePort();
                
                List<Agent> agentsDisponibles = conciergeService.rechercherAgents(xgc, "Paris");
                
                if(agentsDisponibles.size() > 0){
                    
                    Agent agentAReserver = agentsDisponibles.get(0);
                    
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
                    
                    if(conciergeService.reserverAgent(agentAReserver, detailsReservation)){
                        
                        System.err.println("Agent reservé avec succées");
                        
                    }
                    
                }
                
            }

            // paiement.payer(arg0)
        } catch (Exception ex) {
            System.out.printf("Caught Exception: %s\n", ex.getMessage());
        }
    */
    }

}
