package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "hero")
@Inheritance(strategy = InheritanceType.JOINED)
public class Heros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private double score;


    public Heros() {
        super();
    }
    
} 
