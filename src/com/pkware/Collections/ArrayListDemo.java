package com.pkware.Collections;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// Arraylist is growable array
		// non synchronised
		// 10 capacity constructor, size is 0(0 elements)
//		ArrayList al = new ArrayList();
		// Initial capacity
//		ArrayList all = new ArrayList(6);
//		ArrayList alll = new ArrayList(al);
		
		// takes index value but not in case of an object as such like "Deepak"
//		al.remove();
		
//		remove(al1) will remove the common elements and wont give any error
//		clear will remove all
		
		ArrayList al = new ArrayList();
		al.add("Aryan");
		// so no error
		al.remove("ad");
//		System.out.println(al);
		
		// size tells how many elements present 
		System.out.println( al.get(0));
		al.set(0, "bat");
//		give -1 if not present 
		System.out.println(al.indexOf("bat"));
		
		
		
	}

}
