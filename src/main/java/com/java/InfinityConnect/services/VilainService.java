package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.VilainDao;
import com.java.InfinityConnect.daos.VilainDao;
import com.java.InfinityConnect.entities.Vilain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VilainService implements IVilainService {
    @Autowired
    private VilainDao repository;

    public Vilain AddVilain(Vilain vilain) {
        return repository.save(vilain);
    }

    public List<Vilain> findAll() {
        return repository.findAll();
    }

    public Optional<Vilain> findById(long id_vilain) {
        return repository.findById(id_vilain);
    }
}


