package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vilain")
public class Vilain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vilain;

    @Column(name = "nom")
    private String nom;

    @Column(name = "pouvoir")
    private String pouvoir;

    @Column(name = "point_faible")
    private String point_faible;

    @Column(name = "danger")
    private int danger;

    @Column(name = "id_civil")
    private Integer id_civil;

    public Vilain() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoint_faible() {
        return point_faible;
    }

    public void setPoint_faible(String point_faible) {
        this.point_faible = point_faible;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    public int getDanger() {
        return danger;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }


    public int getId_vilain() {
        return id_vilain;
    }

    public void setId_vilain(int id_vilain) {
        this.id_vilain = id_vilain;
    }

    public Integer getId_civil() {
        return id_civil;
    }

    public void setId_civil(Integer id_civil) {
        this.id_civil = id_civil;
    }
}
