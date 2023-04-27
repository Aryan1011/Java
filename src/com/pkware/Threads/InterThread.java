package com.pkware.Threads;

class Test1 extends Thread{
	int a;
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				a++;
			}		
			this.notify();
		}
	}
}

public class InterThread {

	public static void main(String[] args) throws InterruptedException {
//		running thread release lock and goes in wait state, when lock released a notification is sent
//		method are of object class
//		wait - current thread release lock and goes in wait, till invoked by other
//		wait(), wait (till specified time)
//		notify - release lock and notify one
//		notify - release lock and notify all
//		thread should be in synchronised area when using a method
		
		Test1 t =new Test1();
		t.start();
		
		synchronized(t) {
			t.wait();
			System.out.println(t.a);
		}
		
	}

}
