package com.dev.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// elements are not stored in a sorted order but they are retrieved in sorted order -- YT
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(2);
		
		pq.add(10);
		pq.add(20);
		pq.add(2);
		pq.add(13);
		pq.add(30);
		pq.offer(55);
		
		System.out.println(pq);
		
		System.out.println(pq.equals(pq1));
		System.out.println(pq.contains(2));
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());// removes head and returns its
		System.out.println(pq);
		

	}

}
