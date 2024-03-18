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

    @OneToOne
    @JoinColumn(name = "id_civile", referencedColumnName = "id_civile")
    private Civile civile;

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


    public void setIdCivile(int id_civile) {
        if (civile == null) {
            civile = new Civile();
        }
        civile.setId_civile(id_civile);
    }
}
