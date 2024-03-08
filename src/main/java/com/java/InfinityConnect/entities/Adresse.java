package com.java.InfinityConnect.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_adresse;

    @Column(name = "ville")
    private String ville;

    @Column(name = "code_postal")
    private String code_postal;

    @Column(name = "rue")
    private String rue;

    public Adresse() {
    }

}
