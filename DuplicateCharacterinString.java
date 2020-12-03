package com.deepankar;

import java.util.Scanner;

//Find the duplicate characters in a string.
public class DuplicateCharacterinString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int len = str.length();
		int i,j,k;
		char[] arr = str.toCharArray();
		int[] freq = new int[len];
		for(i=0;i<len;i++){
			freq[i] =1;
			for(j=i+1;j<len;j++){
				if(arr[i] == arr[j]){
					freq[i]++;
				}
			}
		}
		
		//Fetch the characters having duplicate count in the String.
		for(k=0;k<freq.length;k++){
			if(arr[k] != ' ' && arr[k] != '0' && freq[k] > 1){
				System.out.println("The duplicate characters in the String is : " + arr[k] +  
						" and their occurence is " + freq[k]);
			}
		}
		
		
		
		

	}

}
