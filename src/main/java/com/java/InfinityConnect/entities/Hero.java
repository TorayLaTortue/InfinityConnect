package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hero")
@Inheritance(strategy = InheritanceType.JOINED)
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_hero;
    private Integer id_civil;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "score")
    private Double score;
    @Column(name = "nom")
    private String nom;
    @Column(name = "commentaire")
    private String commentaire;



    public Hero() {

    }

    public int getId_hero() {
        return id_hero;
    }

    public void setId_hero(Integer id_hero) {
        this.id_hero = id_hero;
    }

    public Integer getId_civil() {
        return id_civil;
    }

    public void setId_civil(Integer id_civil) {
        this.id_civil = id_civil;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
