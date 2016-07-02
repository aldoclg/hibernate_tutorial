package br.unesp.rc.scrumboard.repository;

import org.springframework.data.repository.CrudRepository;

import br.unesp.rc.scrumboard.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{
	
}
