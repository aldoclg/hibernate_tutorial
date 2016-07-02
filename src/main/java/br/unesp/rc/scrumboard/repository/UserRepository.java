package br.unesp.rc.scrumboard.repository;

import org.springframework.data.repository.CrudRepository;

import br.unesp.rc.scrumboard.model.User;

public interface UserRepository extends CrudRepository<User, String> {
	
}
