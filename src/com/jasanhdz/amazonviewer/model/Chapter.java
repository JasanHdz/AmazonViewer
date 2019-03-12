package com.jasanhdz.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {
	
	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n:: CHAPTER ::" +
				"\nTitle: " + getTitle() +
				"\nYear: " + getYear() +
				"\nCreator: " + getCreator() +
				"\nDuration: " + getDuration();
	}
	
	public static ArrayList<Chapter> makeChaptersList() {
		ArrayList<Chapter> chapters = new ArrayList();
		for(int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Chapter " +i, "Genero "+i, "Creator "+i, 49+i, (short)(2015+i), 1+i));
		}
		return chapters;
 	}
}
