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

    public VilainModels(int id_hero, String pouvoir, String point_faible, String danger) {
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.danger = danger;
    }

}
