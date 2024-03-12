package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.entities.Hero;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.CivileService;
import com.java.InfinityConnect.services.HeroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {



    @Autowired
    private CivileService civileService;

    @Autowired
    private HeroService heroService;
    @Autowired
    private AdresseService adresseService;

    //    @Operation(summary = "New hero")
//    @PostMapping("/new hero")
//    public Heros newHero(@RequestBody HerosModels newHero) {
//        Heros heros = new Heros();
//        heros.setNom(newHero.getNom());
//        heros.setPrenom(newHero.getPrenom());
//        heros.setIdAdresse(newHero.getId_adresse());
//        heros.setPouvoir(newHero.getPouvoir());
//        heros.setPoint_faible(newHero.getPoint_faible());
//        return civilService.AddHeros(heros);
//    }


    @Operation(summary = "Transform a Civil into a Heros")
    @PostMapping("/transformToHeros")
    public Hero transformToHeros(@PathVariable Long civilId) {
        Civile civile = civileService.getCivilById(civilId);

        Hero hero = new Hero();
        hero.setNom(civile.getNom());
        hero.setPrenom(civile.getPrenom());
        hero.setIdAdresse(civile.getIdAdresse());

        return heroService.AddHeros(hero);

    }
}
