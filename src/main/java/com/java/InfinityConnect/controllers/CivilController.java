package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.entities.Incident;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivilModels;
import com.java.InfinityConnect.models.IncidentModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.IncidentService;
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
    @Autowired
    private IncidentService incidentService;

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
        adresse.setId_adresse(newAdresse.getId_adresse());
        adresse.setVille(newAdresse.getVille());
        adresse.setCode_postal(newAdresse.getCode_postal());
        adresse.setRue(newAdresse.getRue());
        return adresseService.AddAdresse(adresse);
    }
    @Operation(summary = "Nouvelle Incident")
    @PostMapping("/newIncident")
    public Incident newIncident(@RequestBody IncidentModels newIncident) {
        Incident incident = new Incident();
//        incident.setHero(newIncident.getId_hero());
//        incident.setVilain(newIncident.getId_vilain());
//        incident.setOrganisation(newIncident.getId_organisation());
        incident.setIdAdresse(newIncident.getId_adresse());
        incident.setType_incident(newIncident.getType_incident());
        incident.setDate(newIncident.getDate());
        incident.setCommentaire(newIncident.getCommentaire());
        return incidentService.AddIncident(incident);
    }
}
