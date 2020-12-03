package com.MultipleThreads;

public class MultiThreadDemo {

	public static void main(String[] args) {
		Countdown countdown = new Countdown();
		
		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread1");
		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread2");
		
		//Starting both the threads
		t1.start();
		t2.start(); 
	}
}

class Countdown{
	//Declaring Instance Variable
	private int i;
	public  void doCountdown(){
		String color;
		
		switch(Thread.currentThread().getName()){
		case "Thread 1":
			//color=ThreadColor.ANSI_CYAN;
			break;
		case "Thread2":
			//color=ThreadColor.ANSI_PURPLE;
			break;
		default:
			color = ThreadColor.ANSI_GREEN;
		}
		
		//Syncronized Block
		synchronized (this) {
			for(i=10;i > 0;i--){
				System.out.println(Thread.currentThread().getName() + ": i =" + i);
			}
		}
		
	}
}


class CountdownThread extends Thread{
	private Countdown threadCountdown;
	
	public CountdownThread(Countdown countdown){
	      threadCountdown = countdown;
	}
	public void run(){
		threadCountdown.doCountdown();
	}
}
