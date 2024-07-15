package com.sistemi.informativi.main;

import com.sistemi.informativi.thread.MyThread;

public class Main {

	public static void main(String[] args) {
		
		// NEW
		Thread t1 = new MyThread();
		
		// NEW
		Thread t2 = new MyThread();
		
		// NEW
		Thread t3 = new MyThread();
		
		// RUNNABLE
		t1.start();
		
		// RUNNABLE
		t2.start();
		
		// RUNNABLE
		t3.start();
		
		
		

	}

}
