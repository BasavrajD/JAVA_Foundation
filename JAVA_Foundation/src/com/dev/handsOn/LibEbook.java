package com.dev.handsOn;

public class LibEbook extends LibBook {
	
	private String fileSize;

	public LibEbook(String title, String author, int ISBN, String fileSize) {
		super(title, author, ISBN);
		this.fileSize = fileSize;
	}
	
	public void download() {
		System.out.println("file of size" + fileSize + " is downloaded");
	}

}
