package com.pkware.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyDemo {

	public static void main(String[] args) {
		try {
			
		
		FileInputStream f = new FileInputStream("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\aaa.txt");
		//creates and write
		FileOutputStream w = new FileOutputStream("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");	
		try {
			int i;
			while((i=f.read())!=-1) {
				w.write((char)i);
			}
		}
		finally {
			f.close();
			w.close();
		}
		
		}
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		
		System.out.println("copied");
	}

}
