package com.pkware.Collections;
import java.util.*;

public class Cursors {

	public static void main(String[] args) {
	/*	List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		ListIterator itr = l.listIterator();
		
		// iterator inside itr is present before object 
		while(itr.hasNext()) {
			// prints and places cursor between next and current
			System.out.println(itr.next());
		} 
		
		System.out.println("--------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}*/
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		Enumeration en = v.elements();
		while( en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}

}
