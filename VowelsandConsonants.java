package com.deepankar;

import java.util.Scanner;

public class VowelsandConsonants {

	public static void main(String[] args) {
		int vowel=0,consonant=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		char arr[] = str.toCharArray();
		for(char ch1 : arr){
			if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' || ch1 == 'a'|| ch1 == 'e' 
					|| ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
				vowel++;
			}else{
				consonant++;
			}
		}
		
		System.out.println("The number of vowels are : "  + vowel + " and consonants are : " + consonant);
	}

}
