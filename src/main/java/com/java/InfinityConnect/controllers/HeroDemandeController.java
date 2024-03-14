package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.HeroDemande;
import com.java.InfinityConnect.entities.Mission;
import com.java.InfinityConnect.models.HeroDemandeModels;
import com.java.InfinityConnect.services.HeroDemandeService;
import com.java.InfinityConnect.services.HeroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class HeroDemandeController {

    @Autowired
    private HeroDemandeService heroDemandeService;

    @Operation(summary = "Les demandes de heros")
    @GetMapping("/HeroDemande")
    public List<HeroDemande> getAllHero() {
        return heroDemandeService.findAll();
    }

    @Operation(summary = "Nouvelle demande")
    @PostMapping("/newDemande")
    public HeroDemande newDemande(@RequestBody HeroDemandeModels newDemande) {
        HeroDemande demande = new HeroDemande();
        demande.setId_civil(newDemande.getId_civil());
        demande.setPouvoir(newDemande.getPouvoir());
        demande.setPoint_faible(newDemande.getPoint_faible());
        demande.setCommentaire(newDemande.getCommentaire());
        return heroDemandeService.AddHeroDemande(demande);
    }
    @DeleteMapping("/demande/{id}")
    public ResponseEntity<String> deleteDemande(@PathVariable("id") long id) {
        boolean deleted = heroDemandeService.deleteDemandeById(id);
        if (deleted) {
            return new ResponseEntity<>("Demande supprimée avec succès", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Demande non trouvée", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/last1HeroDemande")
    public List<HeroDemande> getLast1HeroDemande() {
        return heroDemandeService.findTop1ByOrderByIdDemandeDesc();
    }

}