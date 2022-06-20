package org.velezer.service;

import javax.enterprise.context.ApplicationScoped;

import org.velezer.model.Notif;

@ApplicationScoped
public class NotifService {

    public void push(Notif notif) {
        // send to kafka
    }
}
