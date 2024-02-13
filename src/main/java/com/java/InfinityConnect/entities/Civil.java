package com.java.InfinityConnect.entities;

import java.util.ArrayList;


public class Civil {

    private int id_civil;
    private String nom;
    private String prenom;

    private Adresse adresse;

    private String date_naisseance;
    private String date_deces;
    private ArrayList <String> commentaire;
    private String dernier_modif;
    private int incident_declarer;
    private int victime;




    public Civil(int id_civil, String nom, String prenom, Adresse adresse, String date_naissance)
    {
        this.id_civil = id_civil;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.date_naisseance = date_naissance;
                
    }
}
