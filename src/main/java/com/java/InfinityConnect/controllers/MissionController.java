package com.java.InfinityConnect.controllers;

import com.java.InfinityConnect.entities.Mission;
import com.java.InfinityConnect.models.MissionModels;
import com.java.InfinityConnect.services.IMissionService;
import com.java.InfinityConnect.services.MissionService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class MissionController {

    @Autowired
    private MissionService missionService;

    @Operation(summary = "Nouvelle Mission")
    @PostMapping("/newMission")
    public Mission newMission(@RequestBody MissionModels newMission) {
        Mission mission = new Mission();
        mission.setId_incident(newMission.getId_incident());
        mission.setId_hero(newMission.getId_hero());
        mission.setTitre(newMission.getTitre());
        mission.setDateDebut(newMission.getDateDebut());
        mission.setDate_fin(newMission.getDate_fin());
        mission.setUrgence(newMission.getUrgence());
        mission.setId_adresse(newMission.getId_adresse());
        return missionService.AddMission(mission);
    }
    @Operation(summary = "Les missions")
    @GetMapping("/missions")
    public List<Mission> getAllMissions() {
        return missionService.findAll();
    }

    @GetMapping("/last5Missions")
    public List<Mission> getLast5Missions() {
        return missionService.findTop5ByOrderByDateDebutDesc();
    }
}
