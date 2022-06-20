package org.velezer.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.velezer.model.Notif;

import io.smallrye.mutiny.Multi;

@ApplicationScoped
public class NotifService {
    @Inject @Channel("notif-topic") Emitter<Notif> emitter;
    @Inject @Channel("notif-topic") Multi<Notif> notifs;

    public void push(Notif notif) {
        // send to kafka
        emitter.send(notif);
    }

    public Multi<Notif> consume() {
        // get from kafka
        return notifs.log();
    }

    @Transactional
    public void save(Notif notif) {
        notif.persist();
    }
}
