package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseDao extends JpaRepository<Adresse, Long> {
    List<Adresse> findByVille(String ville);
}
