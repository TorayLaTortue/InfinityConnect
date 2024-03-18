package com.java.InfinityConnect.models;

import java.util.ArrayList;
import java.util.Date;

public class VilainModels {

    private int id_vilain;
    private int id_civile;
    private String nom;
    private String pouvoir;
    private String point_faible;
    private int danger;

    public VilainModels(int id_civile, String nom, int id_vilain, String pouvoir, String point_faible, int danger) {
        this.id_vilain = id_vilain;
        this.id_civile = id_civile;
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.danger = danger;
    }

    public int getId_vilain() {
        return id_vilain;
    }

    public int getDanger() {
        return danger;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public String getPoint_faible() {
        return point_faible;
    }

    public int getId_civile() {
        return id_civile;
    }

    public String getNom() {
        return nom;
    }
}
