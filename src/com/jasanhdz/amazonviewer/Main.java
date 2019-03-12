package com.jasanhdz.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.jasanhdz.amazonviewer.model.Book;
import com.jasanhdz.amazonviewer.model.Chapter;
import com.jasanhdz.amazonviewer.model.Movie;
import com.jasanhdz.amazonviewer.model.Serie;
import com.jasanhdz.makereport.Report;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
//		Movie movie = new Movie("Coco", "Animation", "Lee Unkrich", 120, (short)2017);
//		System.out.println(movie);
	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Salir");
			
			// Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);			
			int response = sc.nextInt();
			
			switch(response) {
				case 0:
					exit = 0;
					break;
				case 1: 
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5: 
					makeReport();
					break;
				case 6: 
					makeReport(new Date());
					break;
				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
				break;
			}
			
		} while(exit != 0);
	}
	static ArrayList<Movie> movies = Movie.makeMoviesList();;
	public static void showMovies() {
		int exit = 1;
		
		do {
			System.out.println("\n:: Movies ::\n");
			
			for(int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". "+ movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("\n0. Regresar al Menú anterior \n");
			
			// Leer resouesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if(response == 0) {
				showMenu();
			}
			if(response > 0) {
				Movie movieSelected = movies.get(response-1);
				movieSelected.setViewed(true);
				
				Date dateI = movieSelected.starToSee(new Date());
				
				for(int i = 0; i < 100000; i++) {
					System.out.println("...............");
				}
				
				// Terminar de verla.
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + movieSelected);
				System.out.println("Por: " + movieSelected.getTimeViewed() + "Milisegundos");
			}
			
		} while(exit != 0);
	}
	
	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println("\n:: Series ::\n");
			
			for(int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}
			
			System.out.println("\n0. Regresar al menú anterior.\n");
			
			// Leer respuesta del Usuario.
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			
		} while(exit != 0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;
		do {
			System.out.println("\n:: Chapters ::\n");
			
			for(int i = 0; i < chaptersOfSerieSelected.size(); i++) {
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menú anterior...");
			System.out.println();
			
			// Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.starToSee(new Date());
			
			for(int i = 0; i < 100000; i++) {
				System.out.println("...............");
			}
			
			// Terminamos de Ver el Capitulo.
			chapterSelected.stopToSee(dateI, new Date());
//			chapterSelected.setTimeViewed(timeViewed);
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " Milisegundos");
			
		}while(exit != 0);
	}
	
	public static void showBooks() {
		int exit = 1;
		ArrayList<Book> books = Book.makeBooksList(); 
		do {
			System.out.println("\n:: Books ::\n");
			
			for(int i = 0; i < books.size(); i++) {
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Leído: " + books.get(i).isRedaded());
			}
			
			System.out.println("\n0. Regresar al Menú anterior \n");
			
			// Leer respuesta del Usuario.
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if(response == 0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setRedaded(true);
			
			Date dateI = bookSelected.starToSee(new Date());
			
			for(int i = 0; i < 10000; i++) {
				System.out.println("..............");
			}
			
			// Terminamos de Leer el libro
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Leíste: " + bookSelected);
			System.out.println("Por: " + bookSelected.getTimeReaded() + " Milisegundos");
			
		} while(exit != 0);
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println("\n:: Magazines ::\n");
		} while(exit != 0);
	}
	
	public static void makeReport() {
		Report report = new Report();
		report.setNameFile("Reporte");
		report.setExtension("txt");
		report.setTitle(":: Vistos ::");
		report.setContent("");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("Reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: Vistos ::");
		report.setContent("");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
		
	}
}
