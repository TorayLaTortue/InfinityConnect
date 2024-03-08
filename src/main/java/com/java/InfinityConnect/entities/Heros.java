package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "hero", schema = "public")
@PrimaryKeyJoinColumn(name = "id_civile")
public class Heros extends Civil {

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
}
