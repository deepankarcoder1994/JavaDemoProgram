package com.deepankar;

import java.util.Scanner;

public class SubsetString {

	public static void main(String[] args) {
		String str;
		int temp =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int len = str.length();
		//Total possible subsets for string of size n is n*(n+1)/2
		String[] subset = new String [len*(len+1)/2];
		//Logic to find the subset
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				subset[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		
		System.out.println("The Substring of a given string are ");  
	    for(int i = 0; i < subset.length; i++) {  
	        System.out.println(subset[i]);  
	    }
		
	}

}
