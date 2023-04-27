package com.pkware.Threads;

class Aa{
//	static added
	static int ts=20;
	synchronized static void book(int s) {
		if(ts>=s) {
			System.out.println("Booked" + s);
			ts=ts-s;
			System.out.println("left " + ts);
		}
		else {
			System.out.println("Not");
			System.out.println("left " + ts);
		}
	}
}

class My1 extends Thread{
	Aa a;
	int s;
	My1(Aa a,int s){
		this.a=a;
		this.s=s;
	}
	public void run() {
		a.book(s);
	}
}

class My2 extends Thread{
	Aa a;
	int s;
	My2(Aa a,int s){
		this.a=a;
		this.s=s;
	}
	public void run() {
		a.book(s);
	}
}



public class StaticSync extends Thread {

	public static void main(String[] args) {
		Aa a = new Aa();
		My1 t1 = new My1(a,7);
		t1.start();
		My2 t2 = new My2(a,6);
		t2.start();
		
		Aa a2 = new Aa();
		My1 t3 = new My1(a2,5);
		t3.start();
		My2 t4 = new My2(a2,9);
		t4.start();
		
//		now t1 and t2 wont and t2 and t4 wont interfere
//		but threads of diff objects can
		
	}

}
