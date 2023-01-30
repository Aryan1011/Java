package com.pkware.Oops;


// class scope , same name

/*class Animal{
	private class AnimalInner{
		AnimalInner(){
			System.out.println("inner private");
		}
	}
	Animal(){
		System.out.println("Animal Class constructor");
		AnimalInner in = new AnimalInner();
		
	}
}*/


public class CanPrivateClass {
	
	
	private class Animal{
		Animal(){
			System.out.println("Animal here");
		}
	}
	public void test() {
		Animal ob = new Animal();
	}
	
	public static void main(String[] args) {
//		CanPrivateClass.Animal ;
		CanPrivateClass obj = new CanPrivateClass();
		obj.test();
	}

}
