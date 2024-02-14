package com.java.InfinityConnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class Organisation {
    @Id
    private int id_organisation;
    @Column(name = "nom")
    private String nom;
    @Column(name = "adresse")
    private Adresse adresse;
    @Column(name = "commentaire")
    private ArrayList <String> commentaire;
    @Column(name = "date_ajout")

    private String date_ajout;
    @Column(name = "dernier_modif")

    private String dernier_modif;
    @Column(name = "incident_declarer")

    private int incident_declarer;
    @Column(name = "impliquer_mission")
    private int impliquer_mission;

    public Organisation(int id, String nom, Adresse adresse) {
        this.id_organisation = id;
        this.nom = nom;
        this.adresse = adresse;
    }


}
