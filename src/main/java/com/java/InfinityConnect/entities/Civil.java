package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "civile")
@Inheritance(strategy = InheritanceType.JOINED)
public class Civil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_civile;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private Date date_naissance;
    @Column(name = "date_deces")
    private Date date_deces;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "dernier_update")
    private Date dernier_modif;
    @Column(name = "incident_declarer")
    private int incident_declarer;
    @Column(name = "victime")
    private int victime;

    @Column(name = "id_adresse")
    private int id_adresse;






    public Civil() {

    }

    public int getId_civile() {
        return id_civile;
    }

    public void setId_civile(int id_civile) {
        this.id_civile = id_civile;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_deces() {
        return date_deces;
    }

    public void setDate_deces(Date date_deces) {
        this.date_deces = date_deces;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDernier_modif() {
        return dernier_modif;
    }

    public void setDernier_modif(Date dernier_modif) {
        this.dernier_modif = dernier_modif;
    }

    public int getIncident_declarer() {
        return incident_declarer;
    }

    public void setIncident_declarer(int incident_declarer) {
        this.incident_declarer = incident_declarer;
    }

    public int getVictime() {
        return victime;
    }

    public void setVictime(int victime) {
        this.victime = victime;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }
}
