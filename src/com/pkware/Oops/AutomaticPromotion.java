package com.pkware.Oops;

public class AutomaticPromotion {
	void show(int a) {
		System.out.println("I am called");
	}
	
	public static void main(String args[]) {
		AutomaticPromotion obj = new AutomaticPromotion();
		obj.show('a');
	}
}
