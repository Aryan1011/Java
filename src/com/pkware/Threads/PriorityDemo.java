package com.pkware.Threads;

public class PriorityDemo extends Thread {

	public void run() {
		System.out.println("RUN");
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
//		JVM provides priority on its own and allocates processor
//		1-min 10-max, MIN_PRIORITY, NORM and MAX
//		By default it is 5 and every child thread inherits from parent
		
//		Windows doesnt support priority, so anything can happen here
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		PriorityDemo t = new PriorityDemo();
		t.start();
		
		
	}

}
