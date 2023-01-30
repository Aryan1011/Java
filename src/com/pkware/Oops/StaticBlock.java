package com.pkware.Oops;

public class StaticBlock {
    // native methods are implemented here (other languages)
	static {
		// no way to call this, automatically called
		// earlier we could print hello without main 
		System.out.println("hello");
//		earlier u could also write system.exit(0)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main");
	}

}
