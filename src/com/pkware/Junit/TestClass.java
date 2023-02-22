package com.pkware.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {
	@Test
	public void JunitMethod() {
		System.out.println("Hello World");
		String s = "H2";
		assertEquals("H1",s);
	}
	
	public static void main(String[] args) {
		
	}

}
