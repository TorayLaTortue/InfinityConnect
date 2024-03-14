package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

        import java.util.ArrayList;
@Entity
@Table(name = "hero_demande")
@Inheritance(strategy = InheritanceType.JOINED)
public class HeroDemande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDemande;

    @Column(name = "id_civil")
    private Integer id_civil;
    @Column(name = "pouvoir")
    private String pouvoir;
    @Column(name = "point_faible")
    private String point_faible;
    @Column(name = "nom_hero")
    private String nom_hero;
    @Column(name = "commentaire")
    private String commentaire;




    public HeroDemande() {

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
