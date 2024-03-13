package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hero")
//@PrimaryKeyJoinColumn(name = "id_civile")
public class Hero  {

    @Id
    private int id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private double score;


    public Hero() {
        super();
    }
    
} 
