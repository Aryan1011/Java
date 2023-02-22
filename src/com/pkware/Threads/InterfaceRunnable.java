package com.pkware.Threads;

public class InterfaceRunnable implements Runnable {

	
	// JVM always create main thread, so min one thread always
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceRunnable t = new InterfaceRunnable();
		Thread th = new Thread(t);
		th.start();
	}

	@Override
	public void run() {
		System.out.println("thread");
	}

}
