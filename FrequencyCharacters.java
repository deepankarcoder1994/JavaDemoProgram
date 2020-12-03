package com.deepankar;

import java.util.Scanner;

public class FrequencyCharacters {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for which character frequency is to be calculated:");
		str = sc.nextLine();
		int len = str.length();
		char string[] = str.toCharArray();
		int[] freq = new int[len];
		int i,j;
		for(i=0;i<len;i++){
			freq[i]=1;
			for(j=i+1;j<len;j++){
				if(string[i] == string[j]){
					freq[i] ++;
					//Set string[j] to 0 to avoid printing visited character  
					string[j] = '0';
				}
			}
			
		}
		
		//Displaying the count of each character. 
		System.out.println("The frequency of each character in a String is :");
		for(int k=0;k<freq.length;k++){
			if(string[k] != ' ' && string[k] != '0')  
			System.out.println(string[k] + " - " + freq[k]);
		}

	}

}
