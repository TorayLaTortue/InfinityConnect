package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Hero;
import com.java.InfinityConnect.models.HerosModels;
import com.java.InfinityConnect.services.HeroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class HeroController {

    @Autowired
    private HeroService heroService;
    @GetMapping("/hero/{id}")
    public Hero getHeroById(@PathVariable long id) {
        return heroService.findById(id);
    }
    @Operation(summary = "Les heros")
    @GetMapping("/hero")
    public List<Hero> getAllHero() {
        return heroService.findAll();
    }
    @Operation(summary = "Nouvelle hero")
    @PostMapping("/newHero")
    public Hero newHero(@RequestBody HerosModels newHero) {
        Hero hero = new Hero();
        hero.setId_civil(newHero.getId_civil());
        hero.setPouvoir(newHero.getPouvoir());
        hero.setPoint_faible(newHero.getPoint_faible());
        hero.setCommentaire(newHero.getCommentaire());
        return heroService.AddHero(hero);
    }
}
