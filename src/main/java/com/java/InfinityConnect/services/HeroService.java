package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.HeroDao;
import com.java.InfinityConnect.entities.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService implements IHeroService{
    @Autowired
    private HeroDao repository;

    public Hero AddHero(Hero hero) {
        return repository.save(hero);
    }

    public List<Hero> findAll() {
        return repository.findAll();
    }

    public Hero findById(long id_hero) {
        Optional<Hero> optionalHero = repository.findById(id_hero);
        return optionalHero.orElse(null);
    }


}

