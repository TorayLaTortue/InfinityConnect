package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.entities.Incident;
import com.java.InfinityConnect.entities.Mission;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivilModels;
import com.java.InfinityConnect.models.IncidentModels;
import com.java.InfinityConnect.models.MissionModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.IncidentService;
import com.java.InfinityConnect.services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.java.InfinityConnect.services.CivilService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;

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
        civil.setId_adresse(newCivil.getId_adresse());
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
    @GetMapping("/profil/{id}")
    public Civil getCivilById(@PathVariable long id) {
        return civilService.findById(id);
    }



}
