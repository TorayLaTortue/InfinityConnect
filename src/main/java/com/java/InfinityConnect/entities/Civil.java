package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "civil")
public class Civil {
    @Id
    private int id_civil;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private String date_naissance;
    @Column(name = "date_deces")
    private String date_deces;
    @Column(name = "comentaire")
    private ArrayList <String> commentaire;
    @Column(name = "dernier_modif")
    private String dernier_modif;
    @Column(name = "incident_declarer")
    private int incident_declarer;
    @Column(name = "victime")
    private int victime;

    @OneToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;



    public Civil() {

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

}
