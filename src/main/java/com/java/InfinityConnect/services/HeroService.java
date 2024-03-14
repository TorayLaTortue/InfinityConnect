package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.HerosDao;
import com.java.InfinityConnect.entities.Heros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService implements IHeroService{
    @Autowired
    private HerosDao repository;

    public Heros AddHero(Heros hero) {
        return repository.save(hero);
    }

    public List<Heros> findAll() {
        return repository.findAll();
    }

    public Heros findById(long id_hero) {
        Optional<Heros> optionalHero = repository.findById(id_hero);
        return optionalHero.orElse(null);
    }


}

