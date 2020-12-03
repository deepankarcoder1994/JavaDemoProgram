package com.ThreadDemo;


/*
 * This is One way of creating threads by extending the Thread Class and Overriding the run() method.
 * 
 */
public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from " + currentThread().getName());
		//sleep() method is used to sleep a Thread for a time.
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println("Another Thread woke me up");
			return;
		}
		System.out.println("Three seconds have passed and I am awake");
	}
}
