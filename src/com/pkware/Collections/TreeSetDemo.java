package com.pkware.Collections;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
//		you can also pass comparator comp in constructor 
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(5);
		ns.add(4);
		ns.add(3);
		ns.add(2);
		ns.add(1);
		System.out.println(ns);
//		ns2 = ns.descendingSet();
		System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));
//		pollFirst pollEnd, first and last give elements
        
        
	}

}
