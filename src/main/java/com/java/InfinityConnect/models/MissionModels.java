package com.java.InfinityConnect.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;

public class MissionModels {

    private int id_mission;
    private int id_incident;
    private int id_hero;
    private String titre;
    private Date date_debut;
    private Date date_fin;
    private String urgence ;
    private int id_adresse;


    public MissionModels(int id_mission, int id_incident, int id_hero, String titre, Date date_debut, Date date_fin, String urgence, int id_adresse) {
        this.id_mission = id_mission;
        this.id_incident = id_incident;
        this.id_hero = id_hero;
        this.titre = titre;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.urgence = urgence;
        this.id_adresse = id_adresse;
    }

    public int getId_mission() {
        return id_mission;
    }

    public void setId_mission(int id_mission) {
        this.id_mission = id_mission;
    }

    public int getId_incident() {
        return id_incident;
    }

    public void setId_incident(int id_incident) {
        this.id_incident = id_incident;
    }

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(int id_hero) {
        this.id_hero = id_hero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getUrgence() {
        return urgence;
    }

    public void setUrgence(String urgence) {
        this.urgence = urgence;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }
}
