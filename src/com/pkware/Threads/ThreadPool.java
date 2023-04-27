package com.pkware.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	private String message;
	public WorkerThread(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " Start " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+ " End");
	}

	private void processMessage() {
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class ThreadPool {

	public static void main(String args[]) {
		
		// group of fixed threads are created, managed by service provider
//		service provider pulls out thread and assign to task, once completed thread returned
//		Better performance, avoid thrashing
//		used in jsp and servlet to handle request
//		if 100K req then 100K thread created
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++) {
			WorkerThread workerThread = new WorkerThread("Hello "+i);
			executorService.execute(workerThread);
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {
			
		}
		System.out.println("Finished all");
		
//		Executor Thread pool factory methods
//		newFixedThreadPool(int), newCachedThreadPool, newSingleThreadExecutor
//		ThreadPoolExecutor, ScheduledThreadPoolExecutor are configurable classes
//		future class 
		
//		
		
	}
}
