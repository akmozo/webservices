/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akmozo.webservice.wsclient;

import com.akmozo.webservice.concierges.DetailsReservation;
import com.akmozo.webservice.orchestrateur.Api;
import com.akmozo.webservice.orchestrateur.IOrchestrateur;
import com.akmozo.webservice.paiement.DonneesPaiement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author stagiaire
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String apiURL = "http://localhost/orchestrateur-0.1/api/Orchestrateur?wsdl";

        try {

            URL url = new URL(apiURL);

            IOrchestrateur orchService = new Api(url).getOrchestrateurPort();            

            GregorianCalendar gd = new GregorianCalendar();
            gd.setTime(new Date());
            XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gd);

            DonneesPaiement donneesPaiement = new DonneesPaiement();
            donneesPaiement.setCcvCarte("123");
            donneesPaiement.setDateExpirationCarte(xgc);
            donneesPaiement.setMontant(805.5);
            donneesPaiement.setNomDetenteurCarte("nom prenom");
            donneesPaiement.setNumeroCarte("1234567812345678");

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

            System.err.println("Reservation : " + orchService.payerEtReserverAgent(donneesPaiement, detailsReservation));

        } catch (MalformedURLException | DatatypeConfigurationException ex) {
            System.out.printf("Caught Exception: %s\n", ex.getMessage());
        }
    }

}
