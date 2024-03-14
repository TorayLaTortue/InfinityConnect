package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.entities.Hero;
import com.java.InfinityConnect.entities.Mission;
import jakarta.persistence.*;

public class LitigeModels {

    private int id_litige;

    private int id_civile;

    private String type_litige;

    private int id_hero;

    private int id_mission;
    private String commentaire;

    public LitigeModels(int id_litige, int id_civile, String type_litige, int id_hero, int id_mission, String commentaire) {
        this.id_litige = id_litige;
        this.id_civile = id_civile;
        this.type_litige = type_litige;
        this.id_hero = id_hero;
        this.id_mission = id_mission;
        this.commentaire = commentaire;
    }

    public String getType_litige() {
        return type_litige;
    }

    public void setType_litige(String type_litige) {
        this.type_litige = type_litige;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId_civile() {
        return id_civile;
    }

    public void setId_civile(int id_civile) {
        this.id_civile = id_civile;
    }

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(int id_hero) {
        this.id_hero = id_hero;
    }

    public int getId_litige() {
        return id_litige;
    }

    public void setId_litige(int id_litige) {
        this.id_litige = id_litige;
    }

    public int getId_mission() {
        return id_mission;
    }

    public void setId_mission(int id_mission) {
        this.id_mission = id_mission;
    }
}
