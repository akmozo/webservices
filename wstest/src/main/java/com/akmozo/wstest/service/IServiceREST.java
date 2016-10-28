/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akmozo.wstest.service;

import com.akmozo.wstest.entity.Agent;
import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebService;

@Remote
@WebService
public interface IServiceREST {
    
    public Agent getAgent(@WebParam int paramAgentId);
    
}
