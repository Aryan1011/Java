package com.pkware.Oops;



class Aaa{
	int x=5;
}
class Bbb extends Aaa{
	int x=10;
}

public class VariableOverride {

	public static void main(String[] args) {
		// parent class called
//		Aaa b = new Bbb();
		// parent class
		Bbb b = new Bbb();
		System.out.println(b.x);
	}

}
