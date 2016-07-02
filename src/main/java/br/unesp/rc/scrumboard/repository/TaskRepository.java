package br.unesp.rc.scrumboard.repository;

import org.springframework.data.repository.CrudRepository;

import br.unesp.rc.scrumboard.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
