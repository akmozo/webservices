package com.akmozo.wstest.service;

import com.akmozo.wstest.dao.IAgentDAO;
import com.akmozo.wstest.entity.Agent;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@LocalBean
@Path("/api")
@Produces(MediaType.TEXT_PLAIN)
public class ServiceREST implements IServiceREST {

    @EJB
    IAgentDAO agentDAO;
        
    @GET
    @Path("/agents/{id}")
    @Override
    public Agent getAgent(@PathParam("id") int paramAgentId) {        
        Agent agent = agentDAO.getAgent(paramAgentId);        
        return agent;        
    }
    
}
