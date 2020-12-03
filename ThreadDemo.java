package com.ThreadDemo;

public class ThreadDemo {

	/*
	 * This is One way of creating threads by extending the Thread Class.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello from the main Thread!");
		Thread anotherThread = new AnotherThread();
		//setName() method is used to change the Name of the Thread
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();
		
		//Anonymous Class Creation
		new Thread(){
			public void run(){
				System.out.println("Hello from the Anonymous class Thread");
			}
		}.start();
		
//		//Normal Implementation
//		Thread myRunnableThread = new Thread(new MyRunnable());
//		myRunnableThread.start();
		
		//Via Anonymous Classes
		Thread myRunnableThread2 = new Thread(new MyRunnable(){
			@Override
			public void run() {
				System.out.println("Hello from anonymous Implementation of Runnable Interface!!");
				try{	
					anotherThread.join();
					System.out.println("Another Thread Terminated!!");
				}catch(InterruptedException e){
					System.out.println("I was Interrupted!!");
				}
			}
		});
		
		myRunnableThread2.start();
		/*//Interrupting Another Thread
		anotherThread.interrupt();*/
		
		System.out.println("Hello again from the main Thread");
	}
	
	

}
