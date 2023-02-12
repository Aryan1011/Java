package com.pkware.Oops;
// write annonation for errors
interface lam{
	void show();
}
//class lamChild implements lam{
//	public void show() {
//		System.out.println("I am show");
//	}
//}

public class InterfaceFunctional {

	public static void main(String[] args) {
		// using functional interface 
//		lam a = new lamChild();
//		a.show();
		// using anonymous objects
/*		lam a = new lam() {
			public void show() {
				System.out.println("I am show");
			}
		};
		a.show();
	*/
		
		// lambda expression used with only functional interface
		lam a = ()->System.out.println("I am show");
		a.show();
		// if more than one expression than write {};
		// u can pass var in () also 
		// dont need to even write int i, just i
		// if one var then not even the brackets 
		// also less class files
		// lambda for (i,j) which returns sum is i+j
		// (i,j)->i+j;
	}

}
