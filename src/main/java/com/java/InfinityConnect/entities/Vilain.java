package com.java.InfinityConnect.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vilain")
//@PrimaryKeyJoinColumn(name = "id_civile")
public class Vilain {

    @Id
    private int id_vilain;

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
