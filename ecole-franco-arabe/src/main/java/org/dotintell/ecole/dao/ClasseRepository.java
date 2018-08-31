package org.dotintell.ecole.dao;

import org.dotintell.ecole.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/classes")
public interface ClasseRepository extends JpaRepository<Classe, String>{

}
