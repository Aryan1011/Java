package com.pkware.Oops;

class A{
	int a=10;
	A(){
		System.out.println("A cns");
	}
	
	
	A(int x){
		System.out.println("A paramentrized cns");
	}
}

class B extends A{
	int a=20;
	B(){
		System.out.println("B cns");
	}
	
	
	B(int x){
		this();
		System.out.println("B paramentrized cns");
	}
	B(int x,int y){
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Chaining {

	public static void main(String[] args) {
		// A cns called
//		A a = new A();
//		parametrized called
//		A a = new A(4);
		// b called after a
//		B b = new B();
		// b called after a
//		B b = new B(4);
//		A a = new B();
		
		// so super added in all childs and then u can add this after that 
		
		// this can be returned or passed in method or constructor
		
		// Checking super
		A a = new B(3,4);
		
	}

}
