package com.java.InfinityConnect.daos;

import com.java.InfinityConnect.entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationDao extends JpaRepository<Organisation, Long> {
}
