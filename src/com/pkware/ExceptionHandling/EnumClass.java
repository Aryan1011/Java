package com.pkware.ExceptionHandling;

enum Laptop{
	Macbook(2000), XPS(2200), Surface, Thinkpad(1800);
	// so each object stated above will have price var
	private int price;
	
	private Laptop() {
		
	}
	// sets the price 
	private Laptop(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}

public class EnumClass {

	public static void main(String[] args) {
		Laptop lap = Laptop.Macbook;
		System.out.println(lap + " " + lap.getPrice());
		lap.setPrice(1750);
		System.out.println(lap + " " + lap.getPrice());
	}

}
