package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.CivilDao;
import com.java.InfinityConnect.entities.Civil;
import com.java.InfinityConnect.entities.Heros;
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

    public Heros AddHeros(Heros heros) {
        return repository.save(heros);
    }

    public List<Civil> findAll() {
        return repository.findAll();
    }

    public Optional<Civil> findById(long id_civil) {
        return repository.findById(id_civil);
    }
}

