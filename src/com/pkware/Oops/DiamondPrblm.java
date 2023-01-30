package com.pkware.Oops;

interface Animal{
	// cant specify body
//	void lives() {	
//	}
	
	// this is permissible
//	abstract void lives();
	
	abstract void live();
	
}

// can extend any number but cant implement
//interface Land implements Animal{
//}

interface Land extends Animal{
	default void live() {
		System.out.println("On Land");
	}
}

interface Water extends Animal{
	default void live() {
		System.out.println("In Water");
	}
}

// default of Land used
//class Frog implements Land{
//	
//}

class Frog implements Land, Water{

	public void live() {
		Land.super.live();
		Water.super.live();
	}
	void liveLand() {
		Land.super.live();
	}
	void liveWater() {
		Water.super.live();
	}
}

public class DiamondPrblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frog f = new Frog();
			f.live();
			f.liveLand();
			f.liveWater();
	}

}
