package com.dev.handsOn;
import java.util.ArrayList;


public class StringProblem2 {
	private String userName;
	private String password;
	private String email;
	
	static ArrayList<String> emails = new ArrayList<>();
	
	

	public StringProblem2(String userName, String password, String email) {
		
		this.userName = userName;
		this.password = password;
		this.email = email;
		emails.add(email);
	}
	
	public void validateDetails() {
		if(userName.trim().contains(" ") && !userName.startsWith(" ") && !userName.endsWith(" ")) {
			System.out.println("Valid username");
		}else {
			System.out.println("Invalid username");
		}
		
		if(email.contains("@") && email.endsWith(".com")) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
		
		//having some problems with this---> now fixed, the regex was giving problem, still idk what this regex means.
		if(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
		}
		
	}
	
	static void isUnique(String newEmail) {
		boolean flag = true;
		for(String email: emails) {
			if(email.equalsIgnoreCase(newEmail)) {
				flag = false;
				break;
			}
		}
//		System.out.println(flag);
		System.out.println(flag ? "unique" : "email already registered");
	}
	
	



	public static void main(String[] args) {
		StringProblem2 user1 = new StringProblem2("Raj Patil", "Raja@1213", "raj@gmail.com");
		user1.validateDetails();
		isUnique("raj@gmail.com");

	}

}
