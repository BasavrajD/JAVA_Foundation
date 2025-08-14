package com.dev.handsOn;
import java.util.ArrayList;

public class StringProblem {

	public static void main(String[] args) {
		String str = "I can can I do this Do do this do do this  this";
		
		String temp = "";
		
		ArrayList<String> arr = new ArrayList<>();
		
		
		for(char s: str.toCharArray()) {
			if(s != ' ') {
				temp += s;
			}else if(s == ' ') {
				if(arr.contains(temp)) {
					continue;
				}else {
					arr.add(temp);
					temp = "";
				}
			}
		}
		
		System.out.println(arr);

	}

}
