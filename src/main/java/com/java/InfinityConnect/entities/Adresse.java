package com.java.InfinityConnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
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
