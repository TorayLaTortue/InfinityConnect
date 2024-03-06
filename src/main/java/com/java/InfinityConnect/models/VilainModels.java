package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Adresse;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate; // Assuming you use LocalDate for date_naissance and date_deces
import java.util.ArrayList;

public class VilainModels extends CivilModels {

    private int id_hero;
    private String pouvoir;
    private String point_faible;
    private String danger;

    public VilainModels(int id_civil, int id_hero, String pouvoir, String point_faible, String danger, String nom, String prenom, AdresseModels adresse, String date_naissance, String date_deces, ArrayList<String> commentaire, String dernier_modif, int incident_declarer, int victime) {
        super(id_civil, nom, prenom, adresse, date_naissance, date_deces, commentaire, dernier_modif, incident_declarer, victime);
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.danger = danger;
    }
}
