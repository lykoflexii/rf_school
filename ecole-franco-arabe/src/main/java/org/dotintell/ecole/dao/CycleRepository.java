package org.dotintell.ecole.dao;

import org.dotintell.ecole.entities.Cycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/cycles")
public interface CycleRepository extends JpaRepository<Cycle, String>{

}
