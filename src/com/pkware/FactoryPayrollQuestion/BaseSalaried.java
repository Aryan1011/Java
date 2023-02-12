package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class BaseSalaried implements Payroll {
	final int baseSalary = 7000;
	Scanner sc =null;
	public BaseSalaried(Scanner sc) {
		this.sc=sc;
	}

	@Override
	public int calculatePayroll(Scanner sc) {
		return baseSalary;
	}
	
}
