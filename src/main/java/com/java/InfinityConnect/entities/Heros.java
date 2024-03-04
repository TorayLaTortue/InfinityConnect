package com.java.InfinityConnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class Heros extends Civil {
    @Id
    private int id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private double score;

    public Heros() {

    }
    
} 
