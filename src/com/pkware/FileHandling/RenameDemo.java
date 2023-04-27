package com.pkware.FileHandling;

import java.io.File;

public class RenameDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");
		File r = new File("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\aaa.txt");
		if(f.exists()) {
			System.out.println(f.renameTo(r));
		}else {
			System.out.println("Doesnt Exist");
		}
		System.out.println("Renamed");
	}

}
