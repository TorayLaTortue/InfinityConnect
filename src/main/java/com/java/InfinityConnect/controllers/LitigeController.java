package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Litige;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.LitigeModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.LitigeService;
import com.java.InfinityConnect.services.LitigeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LitigeController {

    @Autowired
    private LitigeService litigeService;

    @Operation(summary = "Nouveau litige")
    @PostMapping("/newLitige")
    public Litige newLitige(@RequestBody LitigeModels newLitige) {
        Litige litige = new Litige();
        litige.setIdCivile(newLitige.getId_civile());
        litige.setType_litige(newLitige.getType_litige());
        litige.setCommentaire(newLitige.getCommentaire());
        litige.setIdHero(newLitige.getId_hero());
        litige.setIdMission(newLitige.getId_mission());
        return litigeService.AddLitige(litige);
    }

}
