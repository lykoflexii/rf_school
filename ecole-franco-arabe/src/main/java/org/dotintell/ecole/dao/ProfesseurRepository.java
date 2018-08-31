package org.dotintell.ecole.dao;

import org.dotintell.ecole.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/professeurs")
public interface ProfesseurRepository extends JpaRepository<Professeur, String> {

}
