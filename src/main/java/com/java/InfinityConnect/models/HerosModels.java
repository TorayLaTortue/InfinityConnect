package com.java.InfinityConnect.models;

import com.java.InfinityConnect.models.CivilModels;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class HerosModels extends CivilModels {
    @Id
    private int id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private double score;

    public HerosModels(int id_civil, String nom, String prenom, AdresseModels adresse, String date_naissance, String date_deces, ArrayList<String> commentaire, String dernier_modif, int incident_declarer, int victime, int id_hero, String pouvoir, String point_faible, double score) {
        super(id_civil, nom, prenom, adresse, date_naissance, date_deces, commentaire, dernier_modif, incident_declarer, victime);
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
    }

}
