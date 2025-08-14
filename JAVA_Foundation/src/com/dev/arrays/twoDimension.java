package com.dev.arrays;

public class twoDimension {

	public static void main(String[] args) {
//		int arr[][] = new int[3][2];
//		
//		arr[0][1] = 10;
				
		//arr.length --- length of rows
		//arr.length[0] -- length of cols
		
		//@D stirng array
		String arr[][] = new String[3][2];
		
		arr[0][0] = "Books";
		arr[1][0] = "Furniture";
		arr[2][0] = "Electronics";
		
		arr[0][1] = "Let us C";
		arr[1][1] = "Bed";
		arr[2][1] = "TV";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		//Associative Array - Object arrray
		
		Object objArr[][] = new Object[5][1];
		
		objArr[0][0] = "Sammy";
		objArr[1][0] = 1;
		objArr[2][0] = 33.33;
		objArr[3][0] = 'M';
		objArr[4][0] = false;

	}

}
