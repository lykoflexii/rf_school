package org.dotintell.ecole.dao;

import org.dotintell.ecole.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/etudiants")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
