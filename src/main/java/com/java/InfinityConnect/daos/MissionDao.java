package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionDao extends JpaRepository<Mission, Long> {
    List<Mission> findTop5ByOrderByDateDebutDesc();
}
