package com.pkware.Threads;
// no. of task = no. of class = no. of threads
class M1 extends Thread{
	public void run() {
		System.out.println("1");
	}
}

class M2 extends Thread{
	public void run() {
		System.out.println("2");
	}
}

public class MultipleTask {
//  cant perform multiple task from single thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m1 = new M1();
		M2 m2 = new M2();
		
		m1.start();
		m2.start();
	}

}
