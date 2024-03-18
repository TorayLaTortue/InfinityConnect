package com.java.InfinityConnect.models;

import java.util.ArrayList;
import java.util.Date;

public class HeroModels {

    private int id_hero;
    private int id_civile;
    private String nom;
    private String pouvoir;

    private String point_faible;

    private double score;

    public HeroModels(int id_civile, String nom, int id_hero, String pouvoir, String point_faible, double score) {
        this.id_hero = id_hero;
        this.id_civile = id_civile;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
    }

    public int getId_civile() {
        return id_civile;
    }

    public void setId_civile(int id_civile) {
        this.id_civile = id_civile;
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

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(int id_hero) {
        this.id_hero = id_hero;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
