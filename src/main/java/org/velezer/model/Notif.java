package org.velezer.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;

// @Entity
public class Notif extends PanacheEntity {

    public String from;
    
    @NotNull
    @NotBlank(message = "body cannot blank")
    public String body;
    public String to;
    public LocalDateTime dateTime;
}