package com.java.InfinityConnect.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class AdresseModels {

    private int id_adresse;

    private String ville;

    private String code_postal;

    private String rue;


    public AdresseModels(int id_adresse, String ville, String code_postal, String rue)
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
