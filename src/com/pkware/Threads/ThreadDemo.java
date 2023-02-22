package com.pkware.Threads;

public class ThreadDemo extends Thread {

	public void run() {
		System.out.println("Thread");
	}
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		// simple call
		t.run();
		// thread created
		t.start();
		//throws exception
		t.start();
	}

}
