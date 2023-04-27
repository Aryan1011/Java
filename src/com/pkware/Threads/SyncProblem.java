package com.pkware.Threads;

class A {
	int ts = 10;

	synchronized void book(int s) {
//		object refrence expresion is this 
//		synchronized (this) {
			if (ts >= s) {
				System.out.println("Booked");
				ts = ts - s;
			} else {
				System.out.println("cant");
			}
			System.out.println("left " + ts);
		}
//	}
}

public class SyncProblem extends Thread {

	static A a;
	int s;

	public void run() {
		a.book(s);
	}

	public static void main(String[] args) throws InterruptedException {
		a = new A();
		SyncProblem aa = new SyncProblem();
		SyncProblem bb = new SyncProblem();
		aa.s = 6;
		bb.s = 7;
		aa.start();
		bb.start();
		// Types Sync - process(not in java) and thread (mutual exclusive and
		// cooperation)
//		mutual by Smethod Sblock and staticS, cooperation by wait notify and notifyALL

//		Object has lock and 2 areas (sync and non sync)

//		suppose 1000 lines and u wanted only 5 lines synchronized, so used synchronized block
//		lock is on object, but static synchronization is for class
		
		
	}

}
