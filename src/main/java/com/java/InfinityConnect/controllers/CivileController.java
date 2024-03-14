package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Adresse;
import com.java.InfinityConnect.entities.Civile;
import com.java.InfinityConnect.models.AdresseModels;
import com.java.InfinityConnect.models.CivileModels;
import com.java.InfinityConnect.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.java.InfinityConnect.services.CivileService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class CivileController {
    @Autowired
    private CivileService civileService;
    @Autowired
    private AdresseService adresseService;



    @Operation(summary = "Nouveau civil")
    @PostMapping("/newCivil")
    public Civile newCivil(@RequestBody CivileModels newCivil) {
        Civile civile = new Civile();
        civile.setNom(newCivil.getNom());
        civile.setPrenom(newCivil.getPrenom());
        civile.setId_adresse(newCivil.getId_adresse());
        return civileService.AddCivil(civile);
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
    public Civile getCivilById(@PathVariable long id) {
        return civileService.findById(id);
    }

    @GetMapping("/adresse/{id}")
    public Adresse getAdresseById(@PathVariable long id) {
        return adresseService.findById(id);
    }

    @GetMapping("/login")
    public ResponseEntity<Civile> getCivilByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
        Civile civile = civileService.findByEmailAndPassword(email, password);
        if (civile != null) {
            return ResponseEntity.ok(civile);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/AdresseByVille")
    public ResponseEntity<List<Adresse>> getAdresseByEmailAndPassword(@RequestParam String ville) {
        List<Adresse> adresses = adresseService.findByVille(ville);
        if (!adresses.isEmpty()) {
            return ResponseEntity.ok(adresses);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PatchMapping("/update/{id}")
    public ResponseEntity<Civile> updateCivilPartially(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        Civile existingCivile = civileService.findById(id);
        if (existingCivile == null) {
            return ResponseEntity.notFound().build();
        }

        // Mettre à jour les propriétés fournies
        for (Map.Entry<String, Object> entry : updates.entrySet()) {
            String field = entry.getKey();
            Object value = entry.getValue();
            LocalDateTime dateTimeActuelle = LocalDateTime.now();
            Date dateActuelle = Date.from(dateTimeActuelle.toInstant(ZoneOffset.UTC));

            // Mettre à jour les propriétés spécifiées
            switch (field) {
                case "nom":
                    existingCivile.setNom((String) value);
                    existingCivile.setDernier_modif(dateActuelle);
                    break;
                case "id_civil":
                    existingCivile.setId_civil((Integer) value);
                    existingCivile.setDernier_modif(dateActuelle);
                    break;
                case "prenom":
                    existingCivile.setPrenom((String) value);
                    existingCivile.setDernier_modif((Date)dateActuelle);
                    break;
                case "commentaire":
                    existingCivile.setCommentaire((String) value);
                    existingCivile.setDernier_modif((Date)dateActuelle);
                    break;
                case "date_naissance":
                    // Convertir la chaîne de caractères en objet Date
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
                        Date parsedDate = dateFormat.parse((String) value);
                        existingCivile.setDate_naissance(parsedDate);
                    } catch (Exception e) {
                        e.printStackTrace();
                        // Gérer l'erreur de conversion de la date
                    }
                    existingCivile.setDernier_modif((Date)dateActuelle);
                    break;
                case "dernier_update":
                    existingCivile.setDernier_modif((Date) value);
                    break;
                case "incident_declarer":
                    existingCivile.setIncident_declarer((Integer) value);
                    break;
                case "victime":
                    existingCivile.setVictime((Integer) value);
                    break;
                case "email":
                    existingCivile.setEmail((String) value);
                    existingCivile.setDernier_modif((Date)dateActuelle);
                    break;
                case "id_adresse":
                    existingCivile.setId_adresse((int) value);
                    existingCivile.setDernier_modif((Date)dateActuelle);
                    break;
                // Ajoutez d'autres cas pour les autres propriétés à mettre à jour
                default:
                    // Gérer les erreurs ou ignorer les propriétés inconnues
                    break;
            }
        }

        // Enregistrer le civil mis à jour
        Civile savedCivile = civileService.save(existingCivile);
        return ResponseEntity.ok(savedCivile);
    }

    @PatchMapping("/updateAdresse/{id}")
    public ResponseEntity<Adresse> updateAdressePartially(@PathVariable Long id, @RequestBody Adresse adresse) {
        Adresse existingAdresse = adresseService.findById(id);
        if (existingAdresse == null) {
            return ResponseEntity.notFound().build();
        }

        // Mettre à jour les champs de l'adresse existante avec les valeurs de l'adresse reçue
        existingAdresse.setVille(adresse.getVille());
        existingAdresse.setCode_postal(adresse.getCode_postal());
        existingAdresse.setRue(adresse.getRue());
        existingAdresse.setNumero(adresse.getNumero());

        // Enregistrer l'adresse mise à jour
        Adresse savedAdresse = adresseService.save(existingAdresse);
        return ResponseEntity.ok(savedAdresse);
    }

}
