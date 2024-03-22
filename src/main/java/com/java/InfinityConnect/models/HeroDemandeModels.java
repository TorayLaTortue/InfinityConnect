package com.java.InfinityConnect.models;

public class HeroDemandeModels {

    private Integer idDemande;
    private Integer id_civil;
    private String pouvoir;
    private String point_faible;
    private String nom_hero;
    private String commentaire;

    public HeroDemandeModels(Integer idDemande, Integer id_civil, String pouvoir, String point_faible, String nom_hero, String commentaire) {
        this.idDemande = idDemande;
        this.id_civil = id_civil;
        this.pouvoir = pouvoir;
        this.point_faible = point_faible;
        this.nom_hero = nom_hero;
        this.commentaire = commentaire;
    }

    public Integer getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Integer idDemande) {
        this.idDemande = idDemande;
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
    public String getNom_hero() {
        return nom_hero;
    }

    public void setNom_hero(String nom_hero) {
        this.nom_hero = nom_hero;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}

