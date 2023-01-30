package com.pkware.Oops;
import java.util.*;

class Parent{
	void show() {
		System.out.println("I am parent");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("I am child");
	}
}

public class CanChildContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pt = new Child();
		pt.show();
//		Child pt = new Parent();
	}

}
