package com.akmozo.wstest.dao;

import com.akmozo.wstest.entity.Agent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AgentDAO implements IAgentDAO {

    @PersistenceContext(unitName = "restoPU")
    EntityManager entityManager;
    
    @Override
    public Agent addAgent(Agent paramAgent) {
        return entityManager.merge(paramAgent);
    }

    @Override
    public Agent getAgent(int paramAgentId) {
        return entityManager.find(Agent.class, paramAgentId);
    }   

    @Override
    public List<Agent> getAgentByVille(String paramVille) {
        return entityManager
                .createQuery("From Agent a Where a.ville Like :ville", Agent.class)
                .setParameter("ville", "%" + paramVille + "%")
                .getResultList();
    } 

    @Override
    public List<Agent> getAgentsByVilleAndHeure(String paramVille, Date paramHeure) {
        
        //entityManager.createNativeQuery("", resultClass)
        
        return new ArrayList<>();        
        
    }

    @Override
    public List<Agent> getAgentsDispoByVilleAndHeure(String paramVille, Date paramHeure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
