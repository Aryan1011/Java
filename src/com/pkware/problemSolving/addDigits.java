package com.pkware.problemSolving;
import java.util.*;
public class addDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number");
		int num = sc.nextInt();
		int ans = 0;
		while (num > 0) {
			ans += num % 10;
			num /= 10;
		}
		System.out.println(ans);
	}

}
