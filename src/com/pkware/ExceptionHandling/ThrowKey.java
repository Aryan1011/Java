package com.pkware.ExceptionHandling;

// for checked write Exception
class YoungAge extends RuntimeException {
//	you can send yr own msg using constructor
//	you can provide default constructor also
	YoungAge(){
		super("Age is less");
	}
	YoungAge(String msg) {
		// so that it is availabel to deafult handler exception
		super(msg);
	}
}

public class ThrowKey {

	public static void main(String[] args) {

//		throw new excptionClassname("msg")
//		now this object is created by programmer not by main
//		should not be used for pre defined exception
//		used for custom/user-defined exceptions
//		like u cant vote(always create unchecked exception)
//		throw new ArithmeticException();

		int age = 16;
		try {

			if (age < 18) {
				// since main cant so you have to make one
				// only one exception can be written
				throw new YoungAge("You are not eligible");
//			control jumps after throw
			} else {
				System.out.println("You have voted");
			}
		} catch (YoungAge e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
