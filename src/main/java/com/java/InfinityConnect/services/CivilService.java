package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.CivilDao;
import com.java.InfinityConnect.entities.Civil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CivilService implements ICivilService{
    @Autowired
    private CivilDao repository;

    public Civil AddCivil(Civil civil) {
        return repository.save(civil);
    }

    public List<Civil> findAll() {
        return repository.findAll();
    }

    public Civil findById(long id_civil) {
        Optional<Civil> optionalCivil = repository.findById(id_civil);
        return optionalCivil.orElse(null); // Retourne null si l'Optional est vide
    }

}

