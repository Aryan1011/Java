package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class BaseSalariedCommission implements Payroll {

	
	Scanner sc = null;
	final int BaseSalary = 5000;
	public BaseSalariedCommission(Scanner sc) {
		this.sc=sc;
	}

	@Override
	public int calculatePayroll(Scanner sc) {
		System.out.println("Enter sales figure");
		int sales = sc.nextInt();
		
		return BaseSalary + (int) (0.22*sales);
	}

}
