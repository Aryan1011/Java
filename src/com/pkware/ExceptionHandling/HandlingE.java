package com.pkware.ExceptionHandling;
import java.io.*;
public class HandlingE {

	public static void main(String[] args) {
		// compiler time
//		FileInputStream fis = new FileInputStream("c:/abc.txt"); 
//		Class.forName("com.mysql/jdbc.Driver");
		
		
		// Runtime 
//		int a = 100/0;
//		String name = null;
//		int l = name.length();
		
		//handling 
		
		// try catch is jai veeru
		try {
			//risky code
			int a =100/0; // jumps to catch
			// code below it is skipped and control jumps to catch
		}
		// write only exception because it is parent class and it will automatically pass control to requord
		// e stores that object made by method
		catch(ArithmeticException e) {
			//handling code
			System.out.println(e); // no trace
			// most effective 
			e.printStackTrace(); // prints name description and stack trace
			System.out.println(e.toString()); // doesnt print stack trace
			System.out.println(e.getMessage());// description only
			
			
			
		}
		
		System.out.println("hello World");
		
	}

}
