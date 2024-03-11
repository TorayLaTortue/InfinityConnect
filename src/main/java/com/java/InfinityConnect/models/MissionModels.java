package com.java.InfinityConnect.models;

import com.java.InfinityConnect.models.CivilModels;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;

public class MissionModels extends IncidentModels {

    private int id_mission;
    private int id_incident;
    private int id_hero;
    private String titre;
    private Date date_debut;
    private Date date_fin;
    private String urgence ;
    private int id_adresse;


    public MissionModels(int id_incident, int id_civil, int id_hero, int id_vilain, int id_organisation, int id_adresse, CivilModels civil, HerosModels hero, VilainModels vilain, OrganisationModels organisation, AdresseModels adresse, String type_incident, Date date, String commentaire, int id_mission, int id_incident1, int id_hero1, String titre, Date date_debut, Date date_fin, String urgence, int id_adresse1) {
        super(id_incident, id_civil, id_hero, id_vilain, id_organisation, id_adresse, civil, hero, vilain, organisation, adresse, type_incident, date, commentaire);
        this.id_mission = id_mission;
        this.id_incident = id_incident1;
        this.id_hero = id_hero1;
        this.titre = titre;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.urgence = urgence;
        this.id_adresse = id_adresse1;
    }
}
