package com.pkware.basics;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		
		//String Pool and .equals
		
/*		String s="Hello";
		String t="Hello";
		String u= new String("Hello");
		String v= new String("Hello");
//		String a=u.intern(); // this adds String to the pool
//		s="world";
		System.out.println(s==t);
		System.out.println(s==u);
		System.out.println(u==v);
		System.out.println(s.equals(v);
	*/	
		
		//String to Char Array
	/*	char c[]= {'a','b','c'};
		String s = new String(c);
		System.out.println(s); */
		
		
		// Constructors
//		String s = new String();
//		String s = new String(String t);
//		String s = new String(StringBuffer t);
//		String s = new String(StringBuilder t);
//		String s = new String(char ch[]);
//		String s = new String(byte ch[]);
		
	// String methods
	/*	String s = "  Aryan  ";
		String t = "";
		String a  = null;
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(a.isEmpty()); */
		
	// compares 
	// .equals case sensitive method, .equalsIgnoreCase is'nt 
	/*	String a = "A"; 
		String b = "a";
		System.out.println(a.compareTo(b)); // A-a
		// + means a>b and - means a<b
		System.out.println(a.compareToIgnoreCase(b)); */
		
	// more methods +, concat, join
	/*	String s="aa";
		String t="bb";
		String u = s+t // gives aabb, and if numeral added it is converted into string from right to left
		String u = String.join(".", "aryan","Chauhan"); // gives aryanchauhan
		*/
		
		// subsequence(returns char sequence) and substring(return string)
	/*	String s = "This is a demo";
		System.out.println(s.subSequence(2, 6)); // 2 to 5
		System.out.println(s.substring(1));
		*/
		
		// replace, replaceFirst, replaceAll
//		s.replace("is","was");
//		s.replaceFirst();
//		s.replaceAll(); // we can provide regex
		
		
		//Searching character in a string
//		String s = "hello World";
//		System.out.println(s.indexOf('e')); // can provide string also
//		lastIndexof, charAt(int), contains("asd") returns true/false
//		startsWith("asd") returns true/false
//		endsWith()
		
		// Case Conversion
//		toLowerCase() deepak to DEEPAK 
		
		//type conversion
//		String s = String.valueOf(data type);
//		char ch[]=String.toCharArray(string);
		
		// StringBuffer methods, Synchronized (low performance)
//		StringBuffer s = new StringBuffer("abc");
//		s.append("java");
//		System.out.println(s);
//		System.out.println(s.capacity()); // 16 + added, increases by (old+1)*2
//		s.delete(2, 4)
//		.equals check refrence only here
//		s.insert(3, "asdn");
//		s.ensureCapacity(100);
//		s.setLength(4);
//		s.trimToSize();
		
		//StringBuilder, Non Synchronized
//		No pool in these two
//		fast faster fastest
		
	}

}
