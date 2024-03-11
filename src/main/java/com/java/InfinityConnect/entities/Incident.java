package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "incident")
@Inheritance(strategy = InheritanceType.JOINED)
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_incident;

    @ManyToOne
    @JoinColumn(name = "id_civile", referencedColumnName = "id_civile")
    private Civil civil;

//    @ManyToOne
//    @JoinColumn(name = "id_hero", referencedColumnName = "id_hero")
//    private Heros hero;
//
//    @ManyToOne
//    @JoinColumn(name = "id_vilain", referencedColumnName = "id_vilain")
//    private Vilain vilain;

    @ManyToOne
    @JoinColumn(name = "id_organisation", referencedColumnName = "id_organisation")
    private Organisation organisation;
//
    @ManyToOne
    @JoinColumn(name = "id_adresse", referencedColumnName = "id_adresse")
    private Adresse adresse;
    @Column(name = "type_incident")
    private String type_incident;
    @Column(name = "date")
    private Date date;
    @Column(name = "commentaire")
    private String commentaire;



}