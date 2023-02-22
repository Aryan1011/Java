package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class Employee {
	String name;
	String email;
	String phone;
	int salary;
	int employeeType;
	
	public Employee(){
		
	}
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	private int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmployeeType() {
		switch (this.employeeType) {
		case 1:
			return "Fixed Salary";
		case 2:
			return "Hour Based";
		case 3:
			return "Fixed Salary plus Commission Based";
		case 4:
			return "Sales based Commission";
		default:
			return "";
		}
	}
	private void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	
	public void SetInfo(Scanner sc) {
		System.out.println("Enter Employee Name");
		this.setName(sc.nextLine());
		System.out.println("Enter Employee Email");
		this.setEmail(sc.nextLine());
		System.out.println("Enter Employee Phone");
		this.setPhone(sc.nextLine());
		System.out.println("Enter Employee Type\n1 for Fixed Salary\n2 for Hourly Based\n3 for Commission Bases\n4 for Commission Based Sales");
		this.setEmployeeType(sc.nextInt());
	}
	
	public void PrintInfo() {
		System.out.println("Details are :-");
		System.out.println("Name :- " + this.getName());
		System.out.println("Email :- " + this.getEmail());
		System.out.println("Phone :- " + this.getPhone());
		System.out.println("Employee Type :- " +  this.getEmployeeType());
		System.out.println("Salary :- " + this.getSalary());
	}
	
}
