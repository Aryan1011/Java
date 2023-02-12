package com.pkware.basics;
import java.util.*;

class Employee implements Comparable<Employee>{
	private String name;
	private String phone;
	private int empId;
	
	public Employee(String name, String phone, int empId) {
		this.name=name;
		this.empId=empId;
		this.phone=phone;
	}
	
	public int getId() {
		return this.empId;
	}
	
	public String toString() {
		return "Emp{" +
				"name = " + name + " " +
				"phone = " + phone + " " +
				"empId = " + empId + " }";
	}

	@Override
	public int compareTo(Employee obj) {
		return this.empId-obj.empId;
	}
	
}

class IdComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getId() - o1.getId();
	}
	
}

public class ComparatorAndComparable {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("aman","8217",1));
		emp.add(new Employee("baman","8417",3));
		emp.add(new Employee("chaman","81217",2));
		System.out.println(emp);
//		comparator - sort acc to multiple logic
//      comparable - single variable logic
		
		// comparable
		Collections.sort(emp);
		System.out.println(emp);
		
//		Now suppose you want to make one more arraylist and sort that acc to phone no.
//		you cant because compareTo can only have one implementation
//		now use comparator
		
		Collections.sort(emp, new IdComp());
		System.out.println(emp);
		
		
		
	}

}
