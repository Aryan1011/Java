package com.pkware.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
//		collection is an interface 
//		Collection objects can't be made
		
/*		ArrayList al = new ArrayList();
		// inserted as an object
		al.add(100);
		al.add("Aryan");
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.add("Basket");
		al.addAll(al2);
		System.out.println(al);
		
		System.out.println(al.contains(100));
		System.out.println( al.isEmpty()  );
		System.out.println(al.size());
		
		// provide index
		// but if string or object then pass name
		al.remove(0);
		al.removeAll(al2);
		// its return type is void
		al.clear();*/
		
		ArrayList item = new ArrayList();
		item.add(10);
		item.add(60);
		item.add(50);
		item.add(40);
		item.add(30);
		item.add(20);
		
		Collections.sort(item);
		System.out.println(item);
		
		System.out.println(Collections.binarySearch(item, 30) );
		
		ArrayList item2 = new ArrayList();
		item2.add(80);
		item.add(20);
		System.out.println( Collections.disjoint(item, item2) );
	}

}
