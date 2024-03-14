package com.java.InfinityConnect.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mission;
    @Column(name = "id_incident")
    private int id_incident;
    @Column(name = "id_hero")
    private int id_hero;

    @Column(name = "titre")
    private String titre;

    @Column(name = "date_debut")
    private Date dateDebut;

    @Column(name = "date_fin")
    private Date date_fin;

    @Column(name = "urgence")
    private String urgence;

    @Column(name = "id_adresse")
    private int adresseId;

    public Mission() {
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        dateDebut = dateDebut;
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
        return adresseId;
    }

    public void setId_adresse(int id_adresse) {
        this.adresseId = id_adresse;
    }
}