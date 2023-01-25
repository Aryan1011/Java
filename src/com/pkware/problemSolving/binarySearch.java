package com.pkware.problemSolving;

import java.util.*;

public class binarySearch {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter number of Elements");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("\nEnter element for Arr[" + i + "]");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("\nEnter key");
		int key = sc.nextInt();
		int i = 0, j = num - 1;
		while (i <= j) {
			int mid = i + (j - i) / 2;
			if (arr[mid] == key) {
				System.out.println("Found");
				return;
			} else if (arr[mid] > key) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		System.out.println("Not Found");
	}
}
