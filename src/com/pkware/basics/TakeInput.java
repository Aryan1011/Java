package com.pkware.basics;
import java.util.*;
public class TakeInput {

	public static void main(String[] args) {
		System.out.println("Hi");
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(5);
		int a=4;
		System.out.println(ls);
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("chala");
		a = sc.nextInt();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(a);
	}

}


