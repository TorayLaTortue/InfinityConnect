package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "litige")
@Inheritance(strategy = InheritanceType.JOINED)
public class Litige {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_litige;
    @OneToOne
    @JoinColumn(name = "id_civile", referencedColumnName = "id_civile")
    private Civile civile;
    @Column(name = "type_litige")
    private String type_litige;
    @OneToOne
    @JoinColumn(name = "id_hero", referencedColumnName = "id_hero")
    private Hero hero;
    @OneToOne
    @JoinColumn(name = "id_mission", referencedColumnName = "id_mission")
    private Mission mission;
    @Column(name = "commentaire")
    private String commentaire;

    public Litige() {

    }

    public void setMdHero(int id_hero) {
        hero.setId_hero(id_hero);
    }
    public void setIdMission(int id_mission) {
        mission.setId_mission(id_mission);
    }
    public void setIdCivile(int id_civile) {
        civile.setId_civile(id_civile);
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setType_litige(String type_litige) {
        this.type_litige = type_litige;
    }

    public void setId_litige(int id_litige) {
        this.id_litige = id_litige;
    }
}
