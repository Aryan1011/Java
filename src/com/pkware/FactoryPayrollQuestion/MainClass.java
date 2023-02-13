package com.pkware.FactoryPayrollQuestion;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		PayrollFactory payrollFactoryObj = new PayrollFactory();
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter Employee Name");
		e1.setName(sc.nextLine());
		System.out.println("Enter Employee Email");
		e1.setEmail(sc.nextLine());
		System.out.println("Enter Employee Phone");
		e1.setPhone(sc.nextLine());
		System.out.println("Enter Employee Type\n1 for Fixed Salary\n2 for Hourly Based\n3 for Commission Bases\n4 for Commission Based Sales");
		e1.setEmployeeType(sc.nextInt());
		
		 try {
			 Payroll payrollObj = payrollFactoryObj.getPayroll(e1.getEmployeeType(),sc);
		 	 e1.setSalary(payrollObj.calculatePayroll(sc));
		 }
		 catch(Exception e) {
			 System.out.println("Payroll calculation method not found");
		 }
		 
		
		System.out.println("Details are :-");
		System.out.println("Name :- " + e1.getName());
		System.out.println("Email :- " + e1.getEmail());
		System.out.println("Phone :- " + e1.getPhone());
		System.out.println("Employee Type :- " +  e1.getEmployeeType());
		System.out.println("Salary :- " + e1.getSalary());

	}

}
