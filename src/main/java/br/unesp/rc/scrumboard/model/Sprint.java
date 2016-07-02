/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.scrumboard.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que mapeia a tabela Sprint
 * @author Cesar
 */
@Entity
@Table(name = "sprints")
public class Sprint extends GenericActivy {

	private static final long serialVersionUID = 7723295649586605348L;
    
	@ManyToOne
	private Project project;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "SPRINTS_TASKS", 
			joinColumns = @JoinColumn(name = "SPRINT_ID"),
			inverseJoinColumns = @JoinColumn(name = "TASK_ID")
	)
    private List<Task> tasks;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
