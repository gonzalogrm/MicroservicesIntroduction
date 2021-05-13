package com.zalost.model;

public class Book {
	private int idbook;
	private String title;
	private String author;
	private String summary;
	private float rating;
	private int numvotes;
	
	public Book() {}
	
	public Book(int idbook, BookData bd, BookRating br){
		addInformation(idbook, bd, br);
	}
	
	public void addInformation(int idbook, BookData bd, BookRating br) {
		this.idbook = idbook;
		title = bd.getTitle();
		author = bd.getAuthor();
		summary = bd.getSummary();
		rating = br.getRating();
		numvotes = br.getNumvotes();
	}
	
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
