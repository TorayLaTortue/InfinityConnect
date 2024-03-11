package com.java.InfinityConnect.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_incident;

    @ManyToOne
    @JoinColumn(name = "id_civile", referencedColumnName = "id_civile")
    private Civil civil;

    @Column(name = "id_hero")
    private int id_hero;

    @Column(name = "id_vilain")
    private int id_vilain;

    @Column(name = "id_organisation")
    private int id_organisation;
//
    @ManyToOne
    @JoinColumn(name = "id_adresse", referencedColumnName = "id_adresse")
    private Adresse adresse;
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

    public Civil getCivil() {
        return civil;
    }

    public void setCivil(Civil civil) {
        this.civil = civil;
    }

    public int getHero() {
        return id_hero;
    }

    public void setHero(int hero) {
        this.id_hero = id_hero;
    }

    public int getVilain() {
        return id_vilain;
    }

    public void setVilain(int vilain) {
        this.id_vilain = id_vilain;
    }

    public int getOrganisation() {
        return id_organisation;
    }

    public void setOrganisation(int id_organisation) {
        this.id_organisation = id_organisation;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setIdAdresse(int id_adresse) {
        if (adresse == null) {
            adresse = new Adresse();
        }
        adresse.setId_adresse(id_adresse);
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