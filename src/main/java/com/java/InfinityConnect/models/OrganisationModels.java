package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Adresse;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class OrganisationModels {
    private int id_organisation;
    private String nom;
    private Adresse adresse;
    private String Dirigeant;
    private String commentaire;
    private String date_ajout;
    private String dernier_modif;
    private int incident_declarer;
    private int impliquer_mission;

    public OrganisationModels(int id_organisation, String nom, Adresse adresse, String Dirigeant, String commentaire, String date_ajout, String dernier_modif, int incident_declarer, int impliquer_mission) {
        this.id_organisation = id_organisation;
        this.nom = nom;
        this.adresse = adresse;
        this.Dirigeant = Dirigeant;
        this.commentaire = commentaire;
        this.date_ajout = date_ajout;
        this.dernier_modif = dernier_modif;
        this.incident_declarer = incident_declarer;
        this.impliquer_mission = impliquer_mission;
    }


}
