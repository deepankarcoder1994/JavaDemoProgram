package com.deepankar;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str,str1="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		str = s.nextLine();
		int n = str.length();
		for(int i =n-1;i>=0;i--){
			str1 = str1 + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(str1)){
			System.out.println("The String is palindome");
		}else{
			System.out.println("The String is not palindrome");
		}
	}
}


