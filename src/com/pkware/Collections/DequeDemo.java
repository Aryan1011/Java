package com.pkware.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
//		Faster than stack and queue(Linked List)
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(1);
		dq.addFirst(2);
		dq.addLast(3);
//		adds at end
		dq.add(0);
		System.out.println(dq);
//		pops from start
		dq.pop();
		System.out.println(dq);
//		pops from end
		dq.poll();
		System.out.println(dq);
		int a = dq.pollFirst();
		int b = dq.pollLast();
//		instead of add u can use offer but it doesnt throw an exception, just returns false
//		or get getfrist getlast 
		dq.peek();
		dq.peekFirst();
		dq.peekLast();
//		cant store null elements 
//		can use iterator and a descendingiterator 
		
		
		
		
		
		
	}

}
