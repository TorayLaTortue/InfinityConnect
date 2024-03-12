package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivileModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import com.java.InfinityConnect.services.CivileService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class CivileController {
    @Autowired
    private CivileService civileService;

    @Autowired
    private HeroService heroService;
    @Autowired
    private AdresseService adresseService;

    @Operation(summary = "Nouveau civil")
    @PostMapping("/newCivil")
    public Civile newCivil(@RequestBody CivileModels newCivil) {
        Civile civile = new Civile();
        civile.setNom(newCivil.getNom());
        civile.setPrenom(newCivil.getPrenom());
        civile.setIdAdresse(newCivil.getId_adresse());
        return civileService.AddCivil(civile);
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



}
