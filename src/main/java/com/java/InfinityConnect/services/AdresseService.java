package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.AdresseDao;
import com.java.InfinityConnect.entities.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdresseService implements IAdresseService{
    @Autowired
    private AdresseDao repository;

    public Adresse AddAdresse(Adresse adresse) {
        return repository.save(adresse);
    }

    public List<Adresse> findAll() {
        return repository.findAll();
    }

    public Optional<Adresse> findById(long id_adresse) {
        return repository.findById(id_adresse);
    }
}

