package com.zalost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User{
	
	//Parameters
	@Id
	@Column(name="iduser") 
	private int iduser;
	
	@Column(name="name") 
	private String name;

	
	//Constructors
	public User() {}
	
	public User(int iduser, String name) {
		this.iduser = iduser;
		this.name = name;
	}
	

	//Getters Setters
	public int getIduser() {
		return iduser;
	}	

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
