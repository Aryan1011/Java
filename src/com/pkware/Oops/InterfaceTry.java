package com.pkware.Oops;

interface Test{
//	compiler adds public static final
	int a=10;
	
//	compiler adds public abstract(only this allowed)
	void show();
//	concrete methods using default or static
//	default void display() {	
//	}
	
	
}
class Child1 implements Test{
	// need to write public here only
	public void show() {
		System.out.println("hi");
	}
}

public class InterfaceTry {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.show();
	}

}
