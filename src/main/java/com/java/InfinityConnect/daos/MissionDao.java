package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionDao extends JpaRepository<Mission, Long> {
}
