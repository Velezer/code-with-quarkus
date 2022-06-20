package org.velezer.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.velezer.model.Notif;
import org.velezer.service.NotifService;

import io.smallrye.mutiny.Multi;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

@Path("notif")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NotifController {
   
    @Inject
    NotifService service;
    
    @POST
    public Notif push(@Valid Notif param){
        service.push(param);
        return param;
    }
    
    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<Notif> pull(){
        return service.consume();
    }
}
