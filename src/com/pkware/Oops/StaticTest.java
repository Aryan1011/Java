package com.pkware.Oops;
/*
class StaticT{
	//static variable
	static int a=10;
	void m1() {
		//this is local variable so cant do
//		static int b=10;
	}
}
*/


public class StaticTest {
	int i=10;
	static int j=5;
	void show() {
		System.out.println("I am show");
	}
	static void display() {
		System.out.println("I am display");
	}
	
	public static void main(String[] args) {
//		cant access this non static data inside static block
//		System.out.println(i);
//		System.out.println(j);
		//cant access non static method
//		show();
		display();
		//cant use this also 
//		System.out.println(this.i);
	}

}
