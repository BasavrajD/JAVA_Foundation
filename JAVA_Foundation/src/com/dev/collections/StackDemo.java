package com.dev.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		System.out.println(st.isEmpty());//from vector class
		System.out.println(st.empty());
		st.push("meow");
		st.add("zzz");
		st.push("okok");
		
		System.out.println(st);
		System.out.println(st.pop());//returns the popped element
		System.out.println(st);
		System.out.println(st.peek());//return top
		System.out.println(st);
		
		System.out.println(st.search("zzz"));//returns index
		st.clear();
		System.out.println(st);

	}

}
