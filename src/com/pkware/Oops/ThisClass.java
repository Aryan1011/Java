package com.pkware.Oops;


class Test2{
	int i;
	void set(int i) {
//		i=x;
//		i=i; // will print 0, because these both are local(0)
		this.i=i;
	}
	void show2() {
		System.out.println("show 2 here");
	}
	void show() {
		System.out.println(i);
		// compiler automatically adds this.show2
		show2();
	}
	
}

public class ThisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test2 t = new Test2();
			t.set(4);
			t.show();
	}

}
