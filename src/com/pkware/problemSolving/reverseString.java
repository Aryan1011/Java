package com.pkware.problemSolving;
import java.util.*;
public class reverseString {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print("\n");
	}
}
