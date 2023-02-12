package com.pkware.Collections;
import java.util.*;
public class SetDemo {
	public static void main(String args[]) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s2.add(6);
		s2.add(7);
		s2.add(8);
		s2.add(9);
		s2.add(10);
		
		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		
		Set<Integer> intersection = new HashSet<Integer>(s2);
		intersection.retainAll(s2);
		
		Set<Integer> difference = new HashSet<Integer>(s2);
		difference.removeAll(s2);
		
//		use add, contains, remove, 
//		HashSet(No order), EnumSet(of EnumSet, high performance), LinkedHashSet(maintains order of insertion), TreeSet(maintains sorted order or as provided)
//	    if 2 same lists are stored then treated as object and 1 stored
		
//		SortedSet, NavigableSet is an interface
		
		
	}
}
