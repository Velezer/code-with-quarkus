package org.velezer.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.velezer.model.Notif;
import org.velezer.service.NotifService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;

@Path("notif")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NotifController {
   
    @Inject
    NotifService service;
    
    @POST
    public String push(Notif param){
        service.push(param);
        return "pushed";
    }
}
