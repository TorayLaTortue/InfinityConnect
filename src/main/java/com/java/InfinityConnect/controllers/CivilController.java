package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.models.CivilModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.java.InfinityConnect.services.CivilService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CivilController {
    @Autowired
    private CivilService civilService;

    @Operation(summary = "Nouveau civil")
    @GetMapping("/New civil")
    public Civil newCivil(@RequestBody CivilModels newCivil) {
        Civil civil = new Civil();
        civil.setNom(newCivil.getNom());
        civil.setPrenom(newCivil.getPrenom());
        return civilService.AddCivil(civil);
    }


}
