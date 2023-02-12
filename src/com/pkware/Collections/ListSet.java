package com.pkware.Collections;
import java.util.*;
public class ListSet {

	public static void main(String[] args) {
//		mostly methods are based on index
/*		List l = new ArrayList();
//		gives error because u r directly adding on first index
//		l.add(1,4); // or by default it is pushed back
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		// makes object with all items and stores in refrence it
//		provides a cursor that point to first element
		Iterator it = l.iterator();
		// hasNext, next, remove
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator itr = l.listIterator();
		// has hasPrevious also
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		not on index based
		Set s = new HashSet();
		s.add(10);
		s.add(20);
//		same with iterator */
		
		
//		 You can also provide initial capacity 
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		System.out.println(al.get(0));
//		Vector is also same 
		
		
	}

}
