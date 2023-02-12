package com.pkware.FactoryPayrollQuestion;

public class Employee {
	String name;
	String email;
	String phone;
	int salary;
	int employeeType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
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
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	
	
}
