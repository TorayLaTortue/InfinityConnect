package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vilain")
@PrimaryKeyJoinColumn(name = "id_civil")
public class Vilain extends Civile {

    //private int id_hero;

    @Column(name = "pouvoir")
    private String pouvoir;

    @Column(name = "point_faible")
    private String point_faible;

    @Column(name = "danger")
    private String danger;

    public Vilain() {
        super();
    }
    
}
