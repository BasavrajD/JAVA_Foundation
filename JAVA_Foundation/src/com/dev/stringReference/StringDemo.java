package com.dev.stringReference;

public class StringDemo {

	public static void main(String[] args) {
		// ways of declaration
		String str = "welcome"; //literals: stores it in the string constant pool
		
		
		//New String object will be created in the memory
		String str1 = new String();//creating a object of String class
		str1 = "hello";
		
		String str2 = new String("Meow");
		
		//some methods
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.compareTo(str1));//converting to unicodes
	
		
		str1.concat(str2);
		System.out.println(str1);//this will return hello only since string is final and immutable
		
		str1 = str1.concat(str2);//correct way to concat OR you can also create str3
		System.out.println(str1);
		
		
		System.out.println(str1.substring(3));
		System.out.println(str2.substring(0, 2));
		
		String str3 = "        Deloitte           ";
		System.out.println(str3.strip());//both sides spaces gone
		System.out.println(str3.stripLeading());//removed left spaces
		System.out.println(str3.stripTrailing());//removed right spaces
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		String s = "ok";
		String s1 = new String("Ok");//both these variables maintained at same address for memory efficiency since they are 
		System.out.println(s == s1); //object level comparison
		System.out.println(s.equals(s1)); //value comparison
		System.out.println(s.equalsIgnoreCase(s1));
//		System.out.println(str1 == str2);//return boolean- true or false
		
		System.out.println(s.replace("o", "oo"));
		
		System.out.println(str1.length());
		
		//handsON
		String str4 = "Welcome to Deloitte 2025 !!!";
		String str5 = str4.toUpperCase();
		System.out.println(str4 == str5); // str4 is not in uppercase
//		int cntUp, cntlow, cntSpace, cntDigit, cntSpecials;
//		for(int i=0; i<str4.length(); i++) {
//			if(str4[i]) {
//				
//			}
//		}
		int upper =0 ,lower=0, space=0, digit=0, special=0;
		for(char ch: str4.toCharArray()) {
			if(Character.isUpperCase(ch)) upper++;
			else if(Character.isLowerCase(ch)) lower++;
			else if(Character.isDigit(ch)) digit++;
			else if(Character.isSpace(ch)) space++;
			else special++;
		}
		System.out.println(upper+ " " + lower + " " + digit + " " + space + " " + special);
		
	}

}
