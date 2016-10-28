package com.akmozo.ws.conciergerie;

import com.akmozo.ws.entity.Agent;
import com.akmozo.ws.entity.DetailsReservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * @author akmozo
 * @version 0.0.1, 13 oct. 2016
 */
@Stateless
@WebService(endpointInterface = "com.akmozo.ws.conciergerie.IConciergerie")
public class Conciergerie implements IConciergerie {

    private List<Agent> agents;
    
    @Override
    public List<Agent> rechercherAgents(Date paramDate, String paramVille) {        
        agents = new ArrayList<>();
        agents.add(new Agent(1, "nom1", "prenom1", "ville1", "0102030401", "agent1@agents.com"));
        agents.add(new Agent(2, "nom2", "prenom2", "ville2", "0102030402", "agent2@agents.com"));
        agents.add(new Agent(3, "nom3", "prenom3", "ville3", "0102030403", "agent3@agents.com"));
        agents.add(new Agent(4, "nom4", "prenom4", "ville4", "0102030404", "agent4@agents.com"));
        agents.add(new Agent(4, "nom5", "prenom5", "ville5", "0102030405", "agent5@agents.com"));
        return agents;
    }

    @Override
    public boolean reserverAgent(Agent paramAgent, DetailsReservation paramDetailsReservation) {        
        return agents.stream().anyMatch((agent) -> (paramAgent.getId() == agent.getId()));
    }
    
}
