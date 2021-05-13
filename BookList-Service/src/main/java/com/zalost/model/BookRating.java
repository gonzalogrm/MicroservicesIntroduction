package com.zalost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookratings")
public class BookRating{
	
	//Parameters
	@Id
	@Column(name="idbook") 
	private int idbook;
	
	@Column(name="rating") 
	private float rating;
	
	@Column(name="numvotes") 
	private int numvotes;

	//Constructor
	public BookRating() {}	
	
	public BookRating(int idbook, float rating, int numvotes) {
		super();
		this.idbook = idbook;
		this.rating = rating;
		this.numvotes = numvotes;
	}

	//Getters Setters
	public int getIdbook() {
		return idbook;
	}

	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getNumvotes() {
		return numvotes;
	}

	public void setNumvotes(int numvotes) {
		this.numvotes = numvotes;
	}
}
