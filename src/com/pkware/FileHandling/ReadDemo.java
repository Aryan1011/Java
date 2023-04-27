package com.pkware.FileHandling;

import java.io.FileReader;

public class ReadDemo {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");
			try {
				int i;
				//reads character by character and returns an integer
				while((i=f.read())!=-1) {
					System.out.println((char)i);
				}
			}
			finally {
				f.close();
			}
		}
		catch(Exception e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}
		
		System.out.println("Written");
		//BuferedReader, FileInputStream, scanner class
		
	}

}
