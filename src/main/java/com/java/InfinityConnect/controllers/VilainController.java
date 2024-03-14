package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Vilain;
import com.java.InfinityConnect.models.VilainModels;
import com.java.InfinityConnect.services.AdresseService;
import com.java.InfinityConnect.services.CivileService;
import com.java.InfinityConnect.services.VilainService;
import com.java.InfinityConnect.services.VilainService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilainController {



    @Autowired
    private CivileService civileService;

    @Autowired
    private VilainService vilainService;
    @Autowired
    private AdresseService adresseService;

    @Operation(summary = "Nouveau vilain")
    @PostMapping("/newVilain")
    public Vilain newVilain(@RequestBody VilainModels newVilain) {
        Vilain vilain = new Vilain();
        vilain.setNom(newVilain.getNom());
        vilain.setPouvoir(newVilain.getPouvoir());
        vilain.setPoint_faible(newVilain.getPoint_faible());
        vilain.setIdCivile(newVilain.getId_civile());
        return vilainService.AddVilain(vilain);
    }

}
