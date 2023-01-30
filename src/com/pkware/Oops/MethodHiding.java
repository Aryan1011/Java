package com.pkware.Oops;

class Pa{
	static void show() {
		System.out.println("Parent");
	}
}

class Ch{
	static void show() {
		System.out.println("Child");
	}
}

public class MethodHiding {

	public static void main(String[] args) {
		
		Ch.show();
		
	}

}
