package com.zalost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookdata")
public class BookData{
	
	//Parameters
	@Id
	@Column(name="idbook") 
	private int idbook;
	
	@Column(name="title") 
	private String title;
	
	@Column(name="author") 
	private String author;
	
	@Column(name="summary") 
	private String summary;

	
	//Constructor
	public BookData() {}

	public BookData(int idbook, String title, String author, String summary) {
		this.idbook = idbook;
		this.title = title;
		this.author = author;
		this.summary = summary;
	}


	//Getters Setters
	public int getIdbook() {
		return idbook;
	}


	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}	
}
