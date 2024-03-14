package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.LitigeDao;
import com.java.InfinityConnect.daos.LitigeDao;
import com.java.InfinityConnect.entities.Litige;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LitigeService implements ILitigeService {
    @Autowired
    private LitigeDao repository;

    public Litige AddLitige(Litige litige) {
        return repository.save(litige);
    }

    public List<Litige> findAll() {
        return repository.findAll();
    }

    public Optional<Litige> findById(long id_litige) {
        return repository.findById(id_litige);
    }
}

