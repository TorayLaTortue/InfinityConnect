package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.entities.Hero;
import com.java.InfinityConnect.entities.Mission;
import jakarta.persistence.*;

public class LitigeModels {

    private int id_litige;

    private Civile civile;

    private String type_litige;

    private Hero hero;

    private Mission mission;
    private String commentaire;

    public LitigeModels(int id_litige, Civile civile, String type_litige, Hero hero, Mission mission, String commentaire) {
        this.id_litige = id_litige;
        this.civile = civile;
        this.type_litige = type_litige;
        this.hero = hero;
        this.mission = mission;
        this.commentaire = commentaire;
    }

    public void setMdHero(int id_hero) {
        hero.setId_hero(id_hero);
    }
    public void setIdMission(int id_mission) {
        mission.setId_mission(id_mission);
    }
    public void setIdCivile(int id_civile) {
        civile.setId_civile(id_civile);
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setType_litige(String type_litige) {
        this.type_litige = type_litige;
    }

    public void setId_litige(int id_litige) {
        this.id_litige = id_litige;
    }
}
