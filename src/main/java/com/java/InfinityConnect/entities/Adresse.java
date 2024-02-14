package com.java.InfinityConnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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


    public Adresse(int id_adresse, String ville, String code_postal, String rue)
    {
        this.id_adresse = id_adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.rue = rue;
    }

    public String getCode_postal() {
        return code_postal;
    }
    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
    public int getId_adresse() {
        return id_adresse;
    }
    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
}
