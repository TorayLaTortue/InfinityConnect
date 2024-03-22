package com.java.InfinityConnect.models;

public class HerosModels {

    private Integer id_hero;
    private Integer id_civil;
    private String pouvoir;

    private String point_faible;

    private Double score;
    private String nom;
    private String commentaire;


    public HerosModels(Integer id_hero, Integer id_civil, String pouvoir, String point_faible, Double score, String nom, String commentaire) {
        this.id_hero = id_hero;
        this.id_civil = id_civil;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.score = score;
        this.nom = nom;
        this.commentaire = commentaire;
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

    public double getScore() {
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
