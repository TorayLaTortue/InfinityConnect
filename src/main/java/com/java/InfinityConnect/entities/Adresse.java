package com.java.InfinityConnect.entities;

public class Adresse {
    private int id_adresse;
    private String ville;
    private String code_postal;
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
