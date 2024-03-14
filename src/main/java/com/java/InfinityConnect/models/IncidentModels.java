package com.java.InfinityConnect.models;

import java.util.Date;

public class IncidentModels {

    private int id_incident;
    private  Integer id_civil;
    private  Integer id_hero;
    private  Integer id_vilain;
    private  Integer id_organisation;
    private  int id_adresse;

//    private CivilModels civil;
//    private HerosModels hero;
//    private VilainModels vilain;
//    private OrganisationModels organisation;
//    private AdresseModels adresse;
    private String type_incident;
    private Date date;
    private String commentaire;


    public IncidentModels(int id_incident, int id_civil, Integer id_hero, Integer id_vilain, Integer id_organisation, int id_adresse, String type_incident, Date date, String commentaire) {
        this.id_incident = id_incident;
        this.id_civil = id_civil;
        this.id_hero = id_hero;
        this.id_vilain = id_vilain;
        this.id_organisation = id_organisation;
        this.id_adresse = id_adresse;
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

    public Integer getId_civil() {
        return id_civil;
    }

    public void setId_civil(Integer id_civil) {
        this.id_civil = id_civil;
    }

    public Integer getId_hero() {
        return id_hero;
    }

    public void setId_hero(Integer id_hero) {
        this.id_hero = id_hero;
    }

    public Integer getId_vilain() {
        return id_vilain;
    }

    public void setId_vilain(Integer id_vilain) {
        this.id_vilain = id_vilain;
    }

    public Integer getId_organisation() {
        return id_organisation;
    }

    public void setId_organisation(Integer id_organisation) {
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
