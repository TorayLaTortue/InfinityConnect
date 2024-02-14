package com.java.InfinityConnect.entities;
public class Vilain extends Civil{
    private int id_hero;
    private String pouvoir;
    private String point_faible;
    private String danger;

    public Vilain(int id_civil, int id_hero, String pouvoir, String point_faible, String danger, String nom, String prenom, int id_adresse, String ville, String code_postal,
            String rue, String date_naissance) {
        super(id_civil, nom, prenom, id_adresse, date_naissance);
        
    }
    
}
