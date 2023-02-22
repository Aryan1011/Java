package com.pkware.FactoryPayrollQuestion;

import java.util.Scanner;

public class PayrollFactory {

	Payroll getPayroll(String input, Scanner sc) {
		switch(input) {
		case "Fixed Salary":
			return new BaseSalaried(sc);
		case "Hour Based":
			return new HourBased(sc);
		case "Fixed Salary plus Commission Based":
			return new BaseSalariedCommission(sc);
		case "Sales based Commission":
			return new SalesBasedCommission(sc);
		default:
			return null;
		}
	}

}
