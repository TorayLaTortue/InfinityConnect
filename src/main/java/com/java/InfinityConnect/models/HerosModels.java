package com.java.InfinityConnect.models;

import com.java.InfinityConnect.models.CivilModels;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;

public class HerosModels {

    private Integer id_hero;

    private String pouvoir;

    private String point_faible;

    private Double score;
    private String nom;

    public HerosModels(Integer id_hero, String pouvoir, String point_faible, Double score, String nom) {
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
        this.nom = nom;
    }

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(Integer id_hero) {
        this.id_hero = id_hero;
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

    public double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
