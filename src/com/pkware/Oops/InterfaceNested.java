package com.pkware.Oops;

abstract class Nested{
	abstract void show();
	 interface Nes2{
		void display();
	}
}

/*class Nested{
//	can be public protected private but default??
	interface Nes2{
		void display();
	}
}*/

//cant declare it protected or private
//interface Nested{
//	void show();
//	// interface inside interface can only be public
//	interface Nes2{
//		void display();
//	}
//}

//
//public class InterfaceNested implements Nested.Nes2 {
//	public void display() {
//		System.out.println("I am display");
//	}
//	public static void main(String[] args) {
//		
//	}
//}

// interface also works, so interface can have a file and we can keep it public
public abstract interface InterfaceNested {
	public static void main(String[] args) {
		System.out.println("Hi");
	}

}
