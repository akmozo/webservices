package com.akmozo.ws.rest;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author akmozo
 * @version 0.0.1, 24 oct. 2016
 */
@Stateless
@LocalBean
@Path("test")
public class RestEJB {

    @GET
    @Path("/demo")
    @Produces(MediaType.TEXT_PLAIN)
    public String something() {
        return "test rest + ejb";
    }

}
