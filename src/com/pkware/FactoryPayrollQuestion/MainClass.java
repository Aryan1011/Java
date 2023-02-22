package com.pkware.FactoryPayrollQuestion;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Setting Info
		Employee e1 = new Employee();
		e1.SetInfo(sc);

		// Brings the required object 
		PayrollFactory payrollFactoryObj = new PayrollFactory();
		try {
			Payroll payrollObj = payrollFactoryObj.getPayroll(e1.getEmployeeType(), sc);
			e1.setSalary(payrollObj.calculatePayroll(sc));
		} catch (Exception e) {
			System.out.println("Payroll calculation method not found");
		}

		// Getting Info
		e1.PrintInfo();
	}

}
