package com.pkware.Threads;

public class InterruptDemo extends Thread {
//	execution Flow ??? 
	
	
	
	public void run() {
//		gives true (becoz interrupted by main), but changes to false so output continues
//		System.out.println(Thread.interrupted());
//		output doesnt continues
		System.out.println(Thread.currentThread().isInterrupted());
		try {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(100);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		used to interrupt an executing thread
//		works when thread is in sleep or wait 
//		if not in that state, will perform normal behaviour or waste command
//		throws interrupted exception 
		
		InterruptDemo t = new InterruptDemo();
		t.start();
		t.interrupt(); // so before sleep it worked now catch block runs
		
//		interrupted and isInterrupted to check if it is interrupted
//		interrupted - clears interrupted status from true to false, if it is interrupted
//		isInterrupted -doesnt change
//		former change the result , later wont if called twice 
//		former is static, later not
		
		
		
	}

}
