package com.pkware.Collections;

import java.util.LinkedList;

public class LLDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		// adds at end only 
		ll.add(2);
		ll.addFirst(3);
		ll.addLast(4);
//		ll.add(4,6);
		System.out.println(ll);
//		ll.removeFirst();
//		ll.removeLast();
//		System.out.println(ll);
		
//		System.out.println(ll.get(0));
//		Object c[]= ll.toArray();
//		int a = ll.size();
		
		
	}

}
