package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.daos.CivilDao;
import com.java.InfinityConnect.daos.HerosDao;
import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.entities.Heros;
import com.java.InfinityConnect.entities.Incident;
import com.java.InfinityConnect.services.CivilService;
import com.java.InfinityConnect.services.HeroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class HerosController {

    @Autowired
    private HeroService heroService;
    @GetMapping("/hero/{id}")
    public Heros getHeroById(@PathVariable long id) {
        return heroService.findById(id);
    }
    @Operation(summary = "Les heros")
    @GetMapping("/hero")
    public List<Heros> getAllHero() {
        return heroService.findAll();
    }
}
