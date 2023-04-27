package com.pkware.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\aryan.chauhan\\eclipse-workspace\\LearningJava\\src\\com\\pkware\\FileHandling\\abc.txt");
		try {
			
			if(f.createNewFile()) {
				System.out.println("File Created");				
			}else {
				System.out.println("Already Exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error has occurred.");
            e.printStackTrace();
		}
	}

}
