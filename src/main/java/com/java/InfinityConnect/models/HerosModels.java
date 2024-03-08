package com.java.InfinityConnect.models;

import com.java.InfinityConnect.models.CivilModels;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;

public class HerosModels extends CivilModels {

    private int id_hero;

    private String pouvoir;

    private String point_faible;

    private double score;

    public HerosModels(int id_civil, int id_adresse, String nom, String prenom, AdresseModels adresse, Date date_naissance, Date date_deces, String commentaire, Date dernier_modif, int incident_declarer, int victime, int id_hero, String pouvoir, String point_faible, double score) {
        super(id_civil, id_adresse, nom, prenom, adresse, date_naissance, date_deces, commentaire, dernier_modif, incident_declarer, victime);
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    public String getPoint_faible() {
        return point_faible;
    }

    public void setPoint_faible(String point_faible) {
        this.point_faible = point_faible;
    }
}
