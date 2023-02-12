package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class HourBased implements Payroll {
	Scanner sc=null;
	final int HourRate = 100;
	public HourBased(Scanner sc) {
		this.sc=sc;
	}
	@Override
	public int calculatePayroll(Scanner sc) {
		System.out.println("Enter number of hours");
		int hours = sc.nextInt();
		if(hours<=40) {
			return hours*HourRate;
		}
		else {
			return (int) ((40*HourRate)+(1.5*(hours-40)*HourRate));
		}
		
	}

}
