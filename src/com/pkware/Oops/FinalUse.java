package com.pkware.Oops;


class FinalA{
	final void show() {
		System.out.println("A");
	}
	private void display() {
		System.out.println("display A");
	}
}

/*class FinalB extends FinalA{
	void show() {
		System.out.println("B");
	}
}*/

class FinalB extends FinalA{
//	void show() {
//		System.out.println("B");
//	}
	private void display() {
		System.out.println("display B");
	}
}

public class FinalUse {

	public static void main(String[] args) {
		// cant be changed now
		//final int i=10;
		//i++;
		
	}

}
