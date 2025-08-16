package com.dev.collections;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);//adds at the last
		ad.add(20);
		ad.add(30);
		ad.addLast(40);
		ad.addFirst(50);
		
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		ad.remove();//removes from first
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		
		ad.offer(55);//adds at last
		ad.offerFirst(11);
		ad.offerLast(44);
		System.out.println(ad);
		
		System.out.println(ad.peek());//return first
		System.out.println(ad.peekFirst());//returns first
		System.out.println(ad.peekLast());//returns last

	}

}
