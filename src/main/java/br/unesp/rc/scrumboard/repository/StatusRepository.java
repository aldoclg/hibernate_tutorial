package br.unesp.rc.scrumboard.repository;

import org.springframework.data.repository.CrudRepository;

import br.unesp.rc.scrumboard.model.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

}
