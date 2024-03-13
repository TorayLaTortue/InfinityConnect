package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.entities.Hero;
import com.java.InfinityConnect.models.HeroModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.CivileService;
import com.java.InfinityConnect.services.HeroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {



    @Autowired
    private CivileService civileService;

    @Autowired
    private HeroService heroService;
    @Autowired
    private AdresseService adresseService;

    @Operation(summary = "Nouveau héros")
    @PostMapping("/newHero")
    public Hero newHero(@RequestBody HeroModels newHero) {
        Hero hero = new Hero();
        hero.setNom(newHero.getNom());
        hero.setPouvoir(newHero.getPouvoir());
        hero.setPoint_faible(newHero.getPoint_faible());
        hero.setIdCivile(newHero.getId_civile());
        return heroService.AddHero(hero);
    }

}
