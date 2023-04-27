package com.pkware.Threads;

public class SleepDemo {

	public static void main(String[] args) {
		
//		Sleep os overloaded, sleep(mili) in native and i java sleep(mili,nano) 
//		Both are static
		
		for(int i=0;i<5;i++) {
			try {// handle interrupted exception
//				cant interupt a thread while it is awake
//				cant take negative or long values
//				if CPU gets busy then no gurantee that it will wake up after exat 500 mili sec
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}

}
