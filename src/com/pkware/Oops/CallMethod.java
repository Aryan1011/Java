package com.pkware.Oops;

public class CallMethod {

	int acc;
	static void check1(int a) {
		a++;
	}
	void check2() {
		this.acc++;
	}
	
	public static void main(String[] args) {
		int a =5;
		//pass by value
//		check1(a);
//		System.out.println(a);
		
		// call by refrence
//		CallMethod c = new CallMethod();
//		c.acc=5;
//		c.check2();
//		System.out.println(c.acc);
	}

}
