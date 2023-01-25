package com.pkware.basics;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Input is 1");
				break;
			case 2:
				System.out.println("Input is 2");
				break;
			case 3:
				System.out.println("Input is 3");
				break;
			case 4:
				System.out.println("Input is 4");
				break;
			case 5:
				System.out.println("Input is 5");
				break;
			case 6:
				System.out.println("Exiting Program");
				break;
			default:
				System.out.println("Other than 5");
			}
		} while (choice != 6);
		sc.close();
	}

}
