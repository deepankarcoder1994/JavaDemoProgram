package com.deepankar;

import java.util.Scanner;
//wrong
public class LongestRepeatingSequence {

	public static void main(String[] args) {
		String str;
		int k =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int len = str.length();
		char[] arr = str.toCharArray();
		char[] arr1 = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length-1;j++){
				if(arr[i] == arr1[j+1] && j==i+1){
					k+=2;
				}
			}
		}
		
		System.out.println(k);
				

	}

}
