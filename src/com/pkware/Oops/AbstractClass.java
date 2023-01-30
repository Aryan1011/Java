package com.pkware.Oops;

abstract class Vehicle{
	int tyre;
	//need to write abstract method and class
	abstract void start();
}
class Car extends Vehicle{
	void start() {
		//Need to implement all 
		System.out.println("With a key");
	}
}
class Scooter extends Vehicle{
	void start() {
		System.out.println("With a kick");
	}
}

public class AbstractClass {
	public static void main(String args[]) {
		Car c = new Car();
		c.start();
	}
}
