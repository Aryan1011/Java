package com.pkware.ExceptionHandling;

// can declare inside and outside a class but not in a method
enum Status{
//	These are objects
	Running, Failed, Pending, Success;
}

public class Enums {

	public static void main(String[] args) {
//		Status s = Status.Running;
//		System.out.println(s);
//		To get no.
//		System.out.println(s.ordinal());
		
//		To print all
//		Status ss[]=Status.values();
//		for(Status s : ss) {
//			System.out.println(s);
//		}
		
	/*	Status s = Status.Running;
		
		if(s == Status.Failed) {
			System.out.println("its failed");
		}else {
			System.out.println("Not failed");
		}
		*/
		// can be used in a switch case also 
		System.out.println(Status.valueOf("Failed"));
		
	}

}
