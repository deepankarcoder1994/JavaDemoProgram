package com.deepankar;

import java.util.Scanner;

//Java Program to find maximum and minimum occurring character in a string
public class MaxMinOccurCharacter {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int len = str.length();
		int[] freq = new int[len];
		char[] arr1 = str.toCharArray();
		int i,j,k;
		//Logic to find the frequency of each Character in a String.
		for(i=0;i<len;i++){
			freq[i]=1;
			for(j=i+1;j<len;j++){
				if(arr1[i] == arr1[j]){
					freq[i]++;
					
					arr1[j] = '0';
				}	
			}
		}
		
		int maxIndex=0,minIndex=0;
		for(k=0;k<freq.length-1;k++){
			if(arr1[k] != ' ' && arr1[k] != '0'){
				if(freq[k] < freq[k+1]){
					maxIndex = k+1;
					minIndex = k;
				}
			}
		}
		if(arr1[k] != ' ' && arr1[k] != '0'){
			System.out.println("The maximum occuring character is : " +arr1[maxIndex] + " and it's frequency is " + freq[maxIndex] + " and the minimum occuring Index is  " + arr1[minIndex] + " and it's frequency is"  + freq[minIndex]);
		}
	}

}
