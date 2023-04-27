package com.pkware.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
	try {
		FileWriter f = new FileWriter("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");
		try {
			//clears all and writes
			f.write("Hello World again");
		}
		finally {
			f.close();
		}
	}
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		System.out.println("Written");
		
		// bufferedwriter, FileOutputStream, PrintWriter
	}

}
