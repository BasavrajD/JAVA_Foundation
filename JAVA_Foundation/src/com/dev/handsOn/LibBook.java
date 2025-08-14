package com.dev.handsOn;

public class LibBook {
	private String title;
	private String author;
	private int ISBN;
	
	public LibBook(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void displayInfo() {
		System.out.println(title + " " + author + " " + ISBN);
	}
	
	
}
