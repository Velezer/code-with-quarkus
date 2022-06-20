package org.velezer.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Notif extends PanacheEntity {

    @NotNull
    public String header;
    
    @NotNull
    public String body;

    @NotNull
    public String footer;
    
    @NotNull
    public Calendar dateTime;
}