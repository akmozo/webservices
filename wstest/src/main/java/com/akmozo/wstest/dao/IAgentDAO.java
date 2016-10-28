package com.akmozo.wstest.dao;

import com.akmozo.wstest.entity.Agent;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IAgentDAO {

    public Agent addAgent(Agent paramAgent);
    public Agent getAgent(int paramAgentId);
    public List<Agent> getAgentByVille(String paramVille);
    /**
     * retourne une liste de tous les agents qui ne sont pas disponibles pour la 
     * ville et l'heure mentionnées.
     * @param paramVille
     * @param paramHeure
     * @return liste des agents
     */
    public List<Agent> getAgentsByVilleAndHeure(String paramVille, Date paramHeure);
    /**
     * retourne une liste de tous les agents qui sont disponibles pour la 
     * ville et l'heure mentionnées.
     * @param paramVille
     * @param paramHeure
     * @return liste des agents
     */    
    public List<Agent> getAgentsDispoByVilleAndHeure(String paramVille, Date paramHeure);    
    
}
