package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.HeroDemande;
import com.java.InfinityConnect.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroDemandeDao extends JpaRepository<HeroDemande, Long> {

    List<HeroDemande> findTop1ByOrderByIdDemandeDesc();
}