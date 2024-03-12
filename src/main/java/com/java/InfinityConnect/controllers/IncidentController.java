package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Incident;
import com.java.InfinityConnect.entities.Mission;
import com.java.InfinityConnect.models.IncidentModels;
import com.java.InfinityConnect.services.IncidentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IncidentController {

    @Autowired
    private IncidentService incidentService;
    @Operation(summary = "Nouvelle Incident")
    @PostMapping("/newIncident")
    public Incident newIncident(@RequestBody IncidentModels newIncident) {
        Incident incident = new Incident();
        incident.setId_hero(newIncident.getId_hero());
        incident.setId_vilain(newIncident.getId_vilain());
        incident.setId_organisation(newIncident.getId_organisation());
        incident.setIdAdresse(newIncident.getId_adresse());
        incident.setType_incident(newIncident.getType_incident());
        incident.setDate(newIncident.getDate());
        incident.setCommentaire(newIncident.getCommentaire());
        return incidentService.AddIncident(incident);
    }
    @Operation(summary = "Les incidents")
    @GetMapping("/incidents")
    public List<Incident> getAllIncident() {
        return incidentService.findAll();
    }
}
