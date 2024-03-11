package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Heros;
import com.java.InfinityConnect.entities.Vilain;

import java.util.ArrayList;
import java.util.Date;

public class IncidentModels {

    private int id_incident;
    private  int id_civil;
    private  int id_hero;
    private  int id_vilain;
    private  int id_organisation;
    private  int id_adresse;

    private CivilModels civil;
    private HerosModels hero;
    private VilainModels vilain;
    private OrganisationModels organisation;
    private AdresseModels adresse;
    private String type_incident;
    private Date date;
    private String commentaire;


    public IncidentModels(int id_incident, int id_civil, int id_hero, int id_vilain, int id_organisation, int id_adresse, CivilModels civil, HerosModels hero, VilainModels vilain, OrganisationModels organisation, AdresseModels adresse, String type_incident, Date date, String commentaire) {
        this.id_incident = id_incident;
        this.id_civil = id_civil;
        this.id_hero = id_hero;
        this.id_vilain = id_vilain;
        this.id_organisation = id_organisation;
        this.id_adresse = id_adresse;
        this.civil = civil;
        this.hero = hero;
        this.vilain = vilain;
        this.organisation = organisation;
        this.adresse = adresse;
        this.type_incident = type_incident;
        this.date = date;
        this.commentaire = commentaire;
    }

    public int getId_incident() {
        return id_incident;
    }

    public void setId_incident(int id_incident) {
        this.id_incident = id_incident;
    }

    public int getId_civil() {
        return id_civil;
    }

    public void setId_civil(int id_civil) {
        this.id_civil = id_civil;
    }

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(int id_hero) {
        this.id_hero = id_hero;
    }

    public int getId_vilain() {
        return id_vilain;
    }

    public void setId_vilain(int id_vilain) {
        this.id_vilain = id_vilain;
    }

    public int getId_organisation() {
        return id_organisation;
    }

    public void setId_organisation(int id_organisation) {
        this.id_organisation = id_organisation;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getType_incident() {
        return type_incident;
    }

    public void setType_incident(String type_incident) {
        this.type_incident = type_incident;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
