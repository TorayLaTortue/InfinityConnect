package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
@Table(name = "organisation")
public class Organisation {
    @Id
    private int id_organisation;
    @Column(name = "nom")
    private String nom;
    @OneToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;
    @Column(name = "dirigeant")
    private String Dirigeant;

    @Column(name = "commentaire")
    private ArrayList <String> commentaire;
    @Column(name = "date_ajout")

    private String date_ajout;
    @Column(name = "dernier_update")

    private String dernier_modif;
    @Column(name = "incident_declarer")

    private int incident_declarer;
    @Column(name = "impliquer_mission")
    private int impliquer_mission;

    public Organisation() {
    }


}
