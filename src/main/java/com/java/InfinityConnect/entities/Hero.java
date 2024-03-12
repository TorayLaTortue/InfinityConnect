package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hero")
public class Hero extends Civile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(int id_hero) {
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

    public void setScore(double score) {
        this.score = score;
    }
}
