package com.zalost.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usercollection")
public class UserCollection {
	//Parameters
	@Id
	@Column(name="idcollection") 
	private int idcollection;
	
	@Column(name="iduser") 
	private int iduser;
	
	@Column(name="idbook") 
	private int idbook;

	
	//Constructors
	public UserCollection() {}

	public UserCollection(int idcollection, int iduser, int idbook) {
		this.idcollection = idcollection;
		this.iduser = iduser;
		this.idbook = idbook;
	}

	
	//Getters Setters
	public int getIdcollection() {
		return idcollection;
	}

	public void setIdcollection(int idcollection) {
		this.idcollection = idcollection;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public int getIdbook() {
		return idbook;
	}
	
	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}
}
