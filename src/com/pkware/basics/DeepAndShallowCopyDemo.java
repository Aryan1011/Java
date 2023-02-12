package com.pkware.basics;
import java.util.*;
public class DeepAndShallowCopyDemo {

	public static void main(String[] args) {
		
//		Storing references of the objects to original memory while storing copies of values
		
		int a[]=new int[]{1,2,3,4};
		int b[]= a.clone();
		System.out.println(a==b);
		
		int arr[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int brr[][]=arr.clone();
		
		System.out.println(arr==brr);
		System.out.println(arr[0]==brr[0]);
		
	}

}
