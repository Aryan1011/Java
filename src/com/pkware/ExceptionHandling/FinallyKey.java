package com.pkware.ExceptionHandling;

public class FinallyKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100/0;
			System.out.println("try");
		}
		// parent after child
		catch(Exception e) { // multiple catchs can be used, but if parent written then cant write again
			System.out.println(e);
		}
		// if jump control statements in try then also finally executed and then control is jumped
		// cases when not executed
//		System.exit(0);
//		If error occur
//		exception in finally that is not handeled
//		thread dies 
		finally { // single finally with one try
			//clean up code, closing code 
			// close file, connection, free resource, locks etc
			// again try catch can be used here 
			System.out.println("finally");
		}
		System.out.println("hello");
		
		
		// individual try, catch, finally is error
		// try catch inside try and inside catch and inside fianally
		// try finally is ok 
		// try finally catch then is wrong
		// no statement b/w try and catch block 
		 
	}

}
