package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroDao extends JpaRepository<Hero, Long> {
}
