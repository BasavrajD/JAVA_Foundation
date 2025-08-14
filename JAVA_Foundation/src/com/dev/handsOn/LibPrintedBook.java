package com.dev.handsOn;

public class LibPrintedBook extends LibBook {
	
	private String shelfLocation;

	public LibPrintedBook(String title, String author, int ISBN, String shelfLocation) {
		super(title, author, ISBN);
		this.shelfLocation = shelfLocation;
		// TODO Auto-generated constructor stub
	}
	
	public void borrow() {
		System.out.println("the book "+ super.getTitle() + " is borrowed from " + shelfLocation)
;	}

}
