package com.pkware.problemSolving;
import java.util.*;
public class factorial {
	public int calFact(int n) {
		if (n == 1)
			return n;
		return n * calFact(n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		factorial f = new factorial();
		System.out.println("\nEnter Number");
		int num = sc.nextInt();
		int ans = f.calFact(num);
		System.out.println("Factorial of " + num + " is " + ans);

	}
}
