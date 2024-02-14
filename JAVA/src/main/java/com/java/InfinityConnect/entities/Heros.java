package com.java.InfinityConnect.entities;

public class Heros extends Civil {
    
    private int id_hero;
    private String pouvoir;
    private String point_faible;
    private double score;


    public Heros(int id_civil, int id_hero, String pouvoir, String point_faible, double score, String nom, String prenom, int id_adresse, String ville, String code_postal, String rue,
            String date_naissance) {
        super(id_civil, nom, prenom, id_adresse, date_naissance);
            }
    
} 
