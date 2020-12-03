package com.RecusionLecture;

public class FactorialIterative {
	//General formula for calculating factorial is 
	// n! = n * (n-1)!

	public static void main(String[] args) {
		System.out.println(IterativeFactorial(3));
		System.out.println(recursiveFactorial(6));
	}
	
	public static int recursiveFactorial(int num){
		//This is the Base Case
		if(num==0){
			return 1;
		}
		
		//Implementing the generic method to calculate recursion.
		return num * recursiveFactorial(num-1);
	}
	
	
	//Iterative Solution
	public static int IterativeFactorial(int num){
		if(num==0){
			return 1;
		}
		
		int factorial = 1;
		for(int i=1;i<=num;i++){
			factorial = factorial * i;
		}
		
		return factorial;
	}

}
