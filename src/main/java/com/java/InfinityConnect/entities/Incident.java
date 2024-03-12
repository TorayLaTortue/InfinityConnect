package com.java.InfinityConnect.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_incident;

    @Column(name = "id_civile")
    private Integer id_civil;

    @Column(name = "id_hero")
    private Integer id_hero;

    @Column(name = "id_vilain")
    private Integer id_vilain;

    @Column(name = "id_organisation")
    private Integer id_organisation;
//
    @Column(name = "id_adresse")
    private int id_adresse;
    @Column(name = "type_incident")
    private String type_incident;
    @Column(name = "date")
    private Date date;
    @Column(name = "commentaire")
    private String commentaire;

    public Incident() {

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

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }
}