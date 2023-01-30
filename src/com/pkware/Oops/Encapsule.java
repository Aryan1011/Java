package com.pkware.Oops;


class Employee{
	private int id;
	public void set(int id) {
		this.id=id;
	}
	public void get() {
		System.out.println(id);
	}
	
}

public class Encapsule {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.set(4);
		e1.get();
	}

}
