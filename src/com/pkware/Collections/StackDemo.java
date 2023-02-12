package com.pkware.Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.search(2));
		System.out.println(st.empty());
//		if u dont want thread safe then use array deque
		
	}

}
