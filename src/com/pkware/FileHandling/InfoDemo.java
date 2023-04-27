package com.pkware.FileHandling;

import java.io.File;

public class InfoDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");
		
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.length());
		}else {
			System.out.println("Doesnt Exist");
		}
		
	}

}
