package com.projects.sgcback.dao;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Place {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitude, latitude, altitude;
    @ManyToOne
    private Salle sallle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;
}
