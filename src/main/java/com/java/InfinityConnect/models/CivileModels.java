package com.java.InfinityConnect.models;

import java.util.ArrayList;
import java.util.Date;

public class CivileModels {

    private Integer id_civil;
    private Integer id_adresse;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private Date date_deces;
    private ArrayList<String> commentaire;
    private Date dernier_modif;
    private Integer incident_declarer;
    private Integer victime;
    private String password;
    private Boolean admin;
    private String email;


    public CivileModels(Integer id_civil, Integer id_adresse, String nom, String prenom, Date date_naissance, Date date_deces, ArrayList<String> commentaire, Date dernier_modif, Integer incident_declarer, Integer victime, String password, Boolean admin, String email) {
        this.id_civil = id_civil;
        this.id_adresse = id_adresse;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.date_deces = date_deces;
        this.commentaire = commentaire;
        this.dernier_modif = dernier_modif;
        this.incident_declarer = incident_declarer;
        this.victime = victime;
        this.password = password;
        this.admin = admin;
        this.email = email;
    }

    public Integer getId_civil() {
        return id_civil;
    }

    public void setId_civil(Integer id_civil) {
        this.id_civil = id_civil;
    }

    public Integer getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(Integer id_adresse) {
        this.id_adresse = id_adresse;
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

    public ArrayList<String> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(ArrayList<String> commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDernier_modif() {
        return dernier_modif;
    }

    public void setDernier_modif(Date dernier_modif) {
        this.dernier_modif = dernier_modif;
    }

    public Integer getIncident_declarer() {
        return incident_declarer;
    }

    public void setIncident_declarer(Integer incident_declarer) {
        this.incident_declarer = incident_declarer;
    }

    public Integer getVictime() {
        return victime;
    }

    public void setVictime(Integer victime) {
        this.victime = victime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
