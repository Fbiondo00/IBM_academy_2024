package com.sistemi.informativi.thread;

public class MyThread extends Thread{
	
	
	public void run() {
		
		for (int i=0; i<5; i++) {
			
			try {
				
				synchronized(MyThread.class) {
			
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Hello " + Thread.currentThread().getName());
			
				}
			
			/*
			 * l'invocazione del metodo sleep
			 * rappresenta l'intervallo di tempo
			 * tra l'accesso di un thread e l'accesso
			 * di un altro alla risorsa condivisa
			 */
			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
