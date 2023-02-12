package com.pkware.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
//		 priority queue and Linked list are not thread safe
	/*	Queue<Integer> q = new LinkedList<>();
		q.add(0);
		q.add(1);
		q.add(2);
		q.remove(); // or q.poll
		System.out.println(q.peek());
		System.out.println(q); */
		// class implementing  queue interface 
		
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(5);
//		pops and print 
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
//		 priorityBlockingQueue
	}

}
