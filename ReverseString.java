package com.deepankar;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		char [] arr = str.toCharArray();
		System.out.print("Reverse of the String entered is :");
		//Logic to reverse a String without Library methods
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
	
	
}
