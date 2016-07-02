/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.scrumboard.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe que mapeia a tabela Project
 * @author Cesar
 */
@Entity
@Table(name = "projects")
public class Project extends GenericActivy {
	
	private static final long serialVersionUID = -2329204966038911406L;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="project")
	private List<Sprint> sprints = new ArrayList<>();	

	public List<Sprint> getSprints() {
		return sprints;
	}

	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}	
	
	/**
	 * Adiciona um sprint ao projeto
	 * @param sprint
	 * @throws NullPointerException
	 */
	public void addSprint(Sprint sprint) {
		if (sprint != null) {
			sprints.add(sprint);
		} else {
			throw new NullPointerException();
		}
	}	
	
	
}
