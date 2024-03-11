package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.CivilDao;
import com.java.InfinityConnect.daos.HerosDao;
import com.java.InfinityConnect.entities.Heros;
import com.java.InfinityConnect.entities.Heros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HerosService implements IHerosService{
    @Autowired
    private HerosDao repository;

    public Heros AddCivil(Heros heros) {
        return repository.save(heros);
    }

    public Heros AddHeros(Heros heros) {
        return repository.save(heros);
    }

    public List<Heros> findAll() {
        return repository.findAll();
    }

    public Optional<Heros> findById(long id_civil) {
        return repository.findById(id_civil);
    }

    public Heros getHerosById(Long id) {
        Optional<Heros> optionalCivil = repository.findById(id);
        return optionalCivil.orElse(null);
    }
}

