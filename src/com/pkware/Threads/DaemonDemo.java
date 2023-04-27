package com.pkware.Threads;

public class DaemonDemo extends Thread {

	public void run() {
		System.out.println("Child Thread");
	}
	
	public static void main(String[] args) {
//		which runs in background, provides service to the thread
//		like garbage collector(to main thread), finalizer, attach listner, signal dispatcher
//		SetDaemon, isDaemon
		
		DaemonDemo t = new DaemonDemo();
//		Have to create before start only, cant after
//		we cant create main Daemon so
//		Thread.currentThread().setDaemon(true);
		t.setDaemon(true);
//		wont provide output becoz no task in main, so it wont provide any service
//		so life span is dependent on the main thread (calling)
//		it inherits type and priority 
//		we should always keep its priority low
		
		System.out.println("Main");
		t.start();
		
		
		
	}

}
