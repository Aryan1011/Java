package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class SalesBasedCommission implements Payroll {

	Scanner sc=null;
	public SalesBasedCommission(Scanner sc) {
		this.sc=sc;
	}

	@Override
	public int calculatePayroll(Scanner sc) {
		System.out.println("Enter sales figure");
		int sales = sc.nextInt();
		
		return (int) (0.15*sales);
	}

}
