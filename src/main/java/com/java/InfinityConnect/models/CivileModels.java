package com.java.InfinityConnect.models;

import java.util.ArrayList;
import java.util.Date;

public class CivileModels {

    private int id_civil;
    private int id_adresse;
    private String nom;
    private String prenom;
    private AdresseModels adresse;
    private Date date_naissance;
    private Date date_deces;
    private ArrayList<String> commentaire;
    private Date dernier_modif;
    private int incident_declarer;
    private int victime;


    public CivileModels(int id_civil, int id_adresse, String nom, String prenom, AdresseModels adresse, Date date_naissance, Date date_deces, ArrayList<String> commentaire, Date dernier_modif, int incident_declarer, int victime) {
        this.id_civil = id_civil;
        this.id_adresse = id_adresse;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.date_naissance = date_naissance;
        this.date_deces = date_deces;
        this.commentaire = commentaire;
        this.dernier_modif = dernier_modif;
        this.incident_declarer = incident_declarer;
        this.victime = victime;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public int getId_adresse() {
        return id_adresse;
    }
}
