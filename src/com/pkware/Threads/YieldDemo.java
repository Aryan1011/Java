package com.pkware.Threads;

public class YieldDemo extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
//		stops current thread and give a chance to other threads 
//		like if one big task yields for a smaller task so that it doesnt have to wait
//		Earlier used sleep, now hint is provided and it totally depends on the scheduler 
		
//		It is native
		
		YieldDemo t= new YieldDemo();
		t.start();
//		Output may vary
			Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(i + Thread.currentThread().getName());
		}
	}

}
