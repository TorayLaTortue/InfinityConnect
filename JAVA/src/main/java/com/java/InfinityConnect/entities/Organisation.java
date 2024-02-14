package com.java.InfinityConnect.entities;

import java.util.ArrayList;

public class Organisation {
    private int id_organisation;
    private String nom;

    private int id_adresse;
    private String adresse;
    private String ville;
    private String code_postal;
    private String rue;

    private ArrayList <String> commentaire;
    private String date_ajout;
    private String dernier_modif;
    private int incident_declarer;
    private int impliquer_mission;

    public Organisation(int id, String nom) {
        this.id_organisation = id;
        this.nom = nom;
    }


}
