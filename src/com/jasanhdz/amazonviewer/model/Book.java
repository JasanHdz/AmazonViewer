package com.jasanhdz.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean redaded;
	private int timeReaded;
	
	public Book(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String isRedaded() {
		return redaded ? "Sí" : "No";
	}

	public void setRedaded(boolean redaded) {
		this.redaded = redaded;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String datailBook = "\n:: BOOK ::" +
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() +
							"\n Edition Date: " + getEditionDate() +
							"\n Authors: " + getAuthors();
		return datailBook;
	}

	@Override
	public Date starToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeReaded(0);
		}
	}
	public static ArrayList<Book> makeBooksList() {
		ArrayList<Book> books = new ArrayList();
		for(int i = 1; i <= 5; i++) {
			books.add(new Book("Book " + i, new Date(), "Editorial " + i));
		}
		return books;
	}
}	
