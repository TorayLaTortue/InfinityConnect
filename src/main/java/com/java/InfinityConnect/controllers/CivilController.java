package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.entities.Heros;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivilModels;
import com.java.InfinityConnect.models.HerosModels;
import com.java.InfinityConnect.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.java.InfinityConnect.services.CivilService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CivilController {
    @Autowired
    private CivilService civilService;
    @Autowired
    private AdresseService adresseService;

    @Operation(summary = "Nouveau civil")
    @PostMapping("/newCivil")
    public Civil newCivil(@RequestBody CivilModels newCivil) {
        Civil civil = new Civil();
        civil.setNom(newCivil.getNom());
        civil.setPrenom(newCivil.getPrenom());
        civil.setIdAdresse(newCivil.getId_adresse());
        return civilService.AddCivil(civil);
    }

    @Operation(summary = "Nouvelle Adresse")
    @PostMapping("/newAdress")
    public Adresse newAdresse(@RequestBody AdresseModels newAdresse) {
        Adresse adresse = new Adresse();
        adresse.setVille(newAdresse.getVille());
        adresse.setCode_postal(newAdresse.getCode_postal());
        adresse.setRue(newAdresse.getRue());
        return adresseService.AddAdresse(adresse);
    }


    @Operation(summary = "New hero")
    @PostMapping("/new hero")
    public Heros newHero(@RequestBody HerosModels newHero) {
        Heros heros = new Heros();
        heros.setNom(newHero.getNom());
        heros.setPrenom(newHero.getPrenom());
        heros.setIdAdresse(newHero.getId_adresse());
        heros.setPouvoir(newHero.getPouvoir());
        heros.setPoint_faible(newHero.getPoint_faible());
        return civilService.AddHeros(heros);
    }
}
