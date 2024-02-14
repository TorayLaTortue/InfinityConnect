package com.java.InfinityConnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Heros extends Civil {
    @Id
    private int id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")

    private double score;


    public Heros(int id_civil, int id_hero, String pouvoir, String point_faible, double score, String nom, String prenom, Adresse adresse, String ville, String code_postal, String rue,
            String date_naissance) {

        this.id_hero = id_hero;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
            }
    
} 
