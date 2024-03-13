package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivileModels;
import com.java.InfinityConnect.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.java.InfinityConnect.services.CivilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.Optional;

@RestController
public class CivileController {
    @Autowired
    private CivilService civilService;
    @Autowired
    private AdresseService adresseService;

    @Operation(summary = "Nouveau civil")
    @PostMapping("/newCivil")
    public Civile newCivil(@RequestBody CivileModels newCivil) {
        Civile civil = new Civile();
        civil.setNom(newCivil.getNom());
        civil.setPrenom(newCivil.getPrenom());
        civil.setIdAdresse(newCivil.getId_adresse());
        return civilService.AddCivil(civil);
    }

    @Operation(summary = "Nouvelle Adresse")
    @PostMapping("/newAdress")
    public Adresse newAdresse(@RequestBody AdresseModels newAdresse) {
        Adresse adresse = new Adresse();
        adresse.setId_adresse(newAdresse.getId_adresse());
        adresse.setVille(newAdresse.getVille());
        adresse.setCode_postal(newAdresse.getCode_postal());
        adresse.setRue(newAdresse.getRue());
        return adresseService.AddAdresse(adresse);
    }

    @Operation(summary = "Obtenir une adresse par ID")
    @GetMapping("/adresse/{id}")
    public ResponseEntity<?> getAdresseById(@PathVariable Long id) {
        Optional<Adresse> optionalAdresse = adresseService.findById(id);
        if (optionalAdresse.isPresent()) {
            Adresse adresse = optionalAdresse.get();
            return ResponseEntity.ok(adresse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
