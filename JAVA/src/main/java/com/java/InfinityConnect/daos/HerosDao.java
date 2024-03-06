package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Heros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HerosDao extends JpaRepository<Heros, Long> {
}
