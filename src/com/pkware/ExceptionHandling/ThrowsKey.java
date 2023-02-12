package com.pkware.ExceptionHandling;

import java.io.*;

class ReadAndWrite{
//	now throws provide indication to the caller function
//	Used with checked exceptions
//	can write many exceptions
	void readFile() throws FileNotFoundException{
//		now when this function doesn't want to handle exception
//		but wants caller function to handle it
		FileInputStream fs = new FileInputStream("c:/abc.txt");
	}
	
}



public class ThrowsKey {
// u can also write throws here, but program will end
// because then JVM will handle
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		//have to handle here now 
		try {
			rw.readFile();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
