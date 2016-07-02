/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.scrumboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "users")
public class User implements Serializable {
    
	private static final long serialVersionUID = -5088867841845970693L;

	@Id
    @Column(unique = true, length = 100, nullable = false)
    @Size(min = 6, max = 100)
    @Email(message = "{email.valid}")
    @NotNull
    private String email;
	
	@Column(length = 144, nullable = false)
	@NotNull
	@Size(min = 4, max = 144)
    private String name;   

    public User() {}  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + '}';
    }   

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(User.class, email);
    }

    @Override
    public boolean equals(Object that) {        
        return EqualsBuilder.reflectionEquals(this, that, "name", "email");
    }
    
    
    
    
}
