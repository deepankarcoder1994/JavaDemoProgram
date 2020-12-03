package com.deepankar;

import java.util.Scanner;

public class PunctuationCharacters {

	public static void main(String[] args) {
		int punctuation=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the String for counting punctuation marks");
		str = sc.nextLine();
		char arr[] = str.toCharArray();
		for(char ch1 : arr){
			if(ch1 == '.' || ch1 == ',' || ch1 == '?' || ch1 == ';' || ch1 == '-' || ch1 =='!' || ch1 == ':'){
				punctuation++;	
			}
		}
		
		System.out.println("The count of punctuation marks in your String is : " + punctuation);
	}
}


