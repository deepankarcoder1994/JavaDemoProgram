package com.InnerClassesDemo;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;
	
	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
		
		for(int i=0;i<maxGears;i++){
			addGear(i,i* 5.3);
		}
	}
	
	 //Operate Clutch Method
	public void operateClutch(boolean in){
		this.clutchIsIn = in;
	}
	
	//Add Gear method
	public void addGear(int number, double ratio){
		if((number > 0) && (number <= maxGears)){
			this.gears.add(new Gear(number,ratio));
		}
	}
	
	
	//Change Gear Method
	public void changeGear(int newGear){
		if((newGear>=0 ) && (newGear< this.gears.size()) && this.clutchIsIn){
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected.");
		}else{
			System.out.println("Grind!!");
			this.currentGear=0;
		}
	}
	
	public double wheelSpeed(int revs){
		if(clutchIsIn){
			System.out.println("Scream!!");
			return 0.0;
		}else{
			return revs * gears.get(currentGear).getRatio();
		}
	}
	
	
	   //Inner Class Gear
       //Making this class as private so that functionality should not be exposed to the Outer World.So this is a good example of encapsulation.
	   private class Gear{
		   private int gearNumber;
		   private double ratio;
		   
		   public double getRatio() {
			return ratio;
		}

		public Gear(int gearNumber, double ratio) {   
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		   
		   public double driveSpeed(int revs){
			   return revs * (this.ratio);
		   }
		
		   
	   }
}
