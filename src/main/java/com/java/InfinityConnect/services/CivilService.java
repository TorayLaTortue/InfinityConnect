package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.CivileDao;
import com.java.InfinityConnect.entities.Civile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CivilService implements ICivilService{
    @Autowired
    private CivileDao repository;

    public Civile AddCivil(Civile civil) {
        return repository.save(civil);
    }

    public List<Civile> findAll() {
        return repository.findAll();
    }

    public Optional<Civile> findById(long id_civil) {
        return repository.findById(id_civil);
    }
}

