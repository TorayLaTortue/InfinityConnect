package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "civile")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Civile {
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

    @OneToOne(mappedBy = "civile", cascade = CascadeType.ALL, orphanRemoval = true)
    private Adresse adresse;






    public Civile() {

    }

    public int getId_civile() {
        return id_civile;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getIdAdresse()
    {
        return adresse.getId_adresse();
    }

    public void setIdAdresse(int id_adresse) {
        if (adresse == null) {
            adresse = new Adresse();
        }
        adresse.setId_adresse(id_adresse);
    }


}
