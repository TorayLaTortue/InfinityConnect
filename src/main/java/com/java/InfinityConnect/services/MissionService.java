package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.MissionDao;
import com.java.InfinityConnect.entities.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService implements IMissionService{
    @Autowired
    private MissionDao repository;

    public Mission AddMission(Mission mission) {
        return repository.save(mission);
    }

    public List<Mission> findAll() {
        return repository.findAll();
    }

    public Optional<Mission> findById(long id_mission) {
        return repository.findById(id_mission);
    }
    public List<Mission> findTop5ByOrderByDateDebutDesc() {
        return repository.findTop5ByOrderByDateDebutDesc();
    }
    public List<Mission> findByAdresseId(Long idAdresse) {
        return repository.findByAdresseId(idAdresse);
    }


}

