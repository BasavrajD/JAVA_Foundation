package com.dev.handsOn;

public class LibTest {

	public static void main(String[] args) {
		LibEbook e = new LibEbook("book1", "author1", 111, "15.1MB");
		
		e.download();
		e.displayInfo();
		
		LibPrintedBook print = new LibPrintedBook("book2", "author2", 222, "bottom right");
		
		print.borrow();
		print.displayInfo();

	}

}
