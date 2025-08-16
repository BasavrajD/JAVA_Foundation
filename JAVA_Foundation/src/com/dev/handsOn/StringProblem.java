package com.dev.handsOn;
//import java.util.ArrayList;

public class StringProblem {

	public static void main(String[] args) {
		String str = "I can can I do this Do do this do do this  this";
		
		String result = "";
		
		String[] words = str.split("\\s+");
		
		for(String s: words) {
			String s1 = s.toLowerCase();
			if(!result.contains(s1)) {
				result += s1 + " ";
			}
		}
		System.out.println(result);
		
		//MY TRY
//		for(char s: str.toCharArray()) {
//			if(s != ' ') {
//				temp += s;
//			}else if(s == ' ') {
//				if(arr.contains(temp)) {
//					continue;
//				}else {
//					arr.add(temp);
//					temp = "";
//				}
//			}
//		}
		
		

	}

}
