package org.velezer.model;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Notif extends PanacheEntity {
    public String from;
    public String body;
    public String to;
    public LocalDateTime dateTime;
}