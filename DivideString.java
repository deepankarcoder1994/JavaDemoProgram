package com.deepankar;

import java.util.Scanner;

//Divide a String in 'N' equal parts

public class DivideString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int len=str.length();
		System.out.println("Enter the number of N equal parts you want to divide the String into:");
		int n = sc.nextInt();
		//Declraing a String Array
		String[] equalStr = new String [n];
		int chars = len/n;
		int temp  =0;
		//Check whether it can be divided into n equal parts or not?
		if(len%n!=0){
			System.out.println("This String cannot be divided into " + n + " equal parts ");
		}else{
			for(int i=0;i<len;i= i + chars){
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
		
		System.out.println(n + " equal parts of given string are ");  
	    for(int i = 0; i < equalStr.length; i++) {  
	        System.out.println(equalStr[i]);  
	        }  
	    }  
		
	}

		  
	}
	


