package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.IncidentDao;
import com.java.InfinityConnect.entities.Incident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentService implements IIncidentService{
    @Autowired
    private IncidentDao repository;

    public Incident AddIncident(Incident incident) {
        return repository.save(incident);
    }

    public List<Incident> findAll() {
        return repository.findAll();
    }

    public Optional<Incident> findById(long id_incident) {
        return repository.findById(id_incident);
    }
}

