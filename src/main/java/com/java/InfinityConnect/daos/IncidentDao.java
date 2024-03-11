package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentDao extends JpaRepository<Incident, Long> {
}
