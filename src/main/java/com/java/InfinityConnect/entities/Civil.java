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
    private ArrayList <String> commentaire;
    @Column(name = "dernier_update")
    private Date dernier_modif;
    @Column(name = "incident_declarer")
    private int incident_declarer;
    @Column(name = "victime")
    private int victime;

    @OneToOne
    @JoinColumn(name = "id_adresse", referencedColumnName = "id_adresse")
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setIdAdresse(int id_adresse) {
        if (adresse == null) {
            adresse = new Adresse();
        }
        adresse.setId_adresse(id_adresse);
    }
}
