package com.jasanhdz.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	
	private int id;
	
	public Magazine(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n:: MAGAZINE ::" +
				"\nTitle: " + getTitle() +
				"\nEditorial: " + getEditorial() +
				"\nEdition Date: " + getEditionDate();
	}
	
}