package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "civile")
@Inheritance(strategy = InheritanceType.JOINED)
public class Civile {
    @Id
    @Column(name = "id_civil")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_civil;
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
    private Integer incident_declarer;
    @Column(name = "victime")
    private Integer victime;

    @Column(name = "id_adresse")
    private int id_adresse;
    @Column(name = "password")
    private String password;
    @Column(name = "admin")
    private Boolean admin;
    @Column(name = "email")
    private String email;







    public Civile() {

    }

    public Integer getId_civil() {
        return id_civil;
    }

    public void setId_civil(Integer id_civil) {
        this.id_civil = id_civil;
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

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
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
