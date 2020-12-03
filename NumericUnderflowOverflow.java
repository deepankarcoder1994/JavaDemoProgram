package com.deepankar;

public class NumericUnderflowOverflow {
	
	public static void main(String[] args){
		//Example of Overflow
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int max1 = max+1;
		System.out.println(max1);
	}

}
