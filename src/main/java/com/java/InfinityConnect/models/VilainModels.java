package com.java.InfinityConnect.models;

import com.java.InfinityConnect.entities.Adresse;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate; // Assuming you use LocalDate for date_naissance and date_deces
import java.util.ArrayList;
import java.util.Date;

public class VilainModels {

    private int id_hero;
    private String pouvoir;
    private String point_faible;
    private String danger;

    public VilainModels(int id_hero, String pouvoir, String point_faible, String danger) {
        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.danger = danger;
    }

}
