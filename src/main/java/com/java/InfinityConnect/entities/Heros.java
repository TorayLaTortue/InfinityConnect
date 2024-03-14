package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "hero")
@Inheritance(strategy = InheritanceType.JOINED)
public class Heros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_hero;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private Double score;
    @Column(name = "nom")
    private String nom;



    public Heros() {

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

    public Double getScore() {
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
