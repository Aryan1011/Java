package com.pkware.Threads;

public class MethodsDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// current thread is a static method it returns refrence value of current class
		Thread.currentThread().setName("Aryan");
		System.out.println(Thread.currentThread().getName());
		// jvm provides name as Thread - n, n= 0,1,2
		
		
	}

}
