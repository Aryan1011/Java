package com.pkware.Threads;

public class JoinDemo extends Thread {
	static Thread ma;
	public void run() {
		try {
//			ma.join();
			for(int i=0;i<5;i++) {
				System.out.println("child");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
//		if a thread wants to wait for other thread to complete his task
//		t1 then t2 then t3, so t2 waits for t1
		
//		join throws interrupted exception
//		synchronised join (long mili) throws again
//		mili,nano and rest is same 
		ma = Thread.currentThread();
		JoinDemo t = new JoinDemo();
		t.start();
		
		//we want main to start after thread
		
		try {
			for(int i=0;i<5;i++) {
//				t.join();//so wait for t
				System.out.println("main");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
