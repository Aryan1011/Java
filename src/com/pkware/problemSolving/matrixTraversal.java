package com.pkware.problemSolving;
import java.util.*;
public class matrixTraversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Rows");
		int rows = sc.nextInt();
		System.out.println("\nEnter Coloums");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("\nEnter element for Arr[" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nEntered array is");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
