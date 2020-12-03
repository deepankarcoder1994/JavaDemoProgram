package com.deepankar;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		int i=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the String");
		 str = sc.nextLine();
		char charArr[] = str.toCharArray();
		for(char ch1 : charArr){
			i++;
		}
		
		System.out.println("The total number of characters in the String are: " + i);
	}

}
