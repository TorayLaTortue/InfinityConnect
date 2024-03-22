
package com.java.InfinityConnect.services;

import com.java.InfinityConnect.daos.HeroDemandeDao;
import com.java.InfinityConnect.entities.HeroDemande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroDemandeService implements IHeroDemandeService {
    @Autowired
    private HeroDemandeDao repository;

    public HeroDemande AddHeroDemande(HeroDemande heroDemande) {
        return repository.save(heroDemande);
    }

    public List<HeroDemande> findAll() {
        return repository.findAll();
    }

    public HeroDemande findById(long idDemande) {
        Optional<HeroDemande> optionalHeroDemande = repository.findById(idDemande);
        return optionalHeroDemande.orElse(null);
    }
    public boolean deleteDemandeById(long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public List<HeroDemande> findTop1ByOrderByIdDemandeDesc() {
        return repository.findTop1ByOrderByIdDemandeDesc();
    }


}


