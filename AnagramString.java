package com.deepankar;

import java.util.Scanner;

//Anagram String Program
/*An anagram of a string is another string that contains same characters, 
 *only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
 */

public class AnagramString {

	public static void main(String[] args) {
		String str1,str2;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings");
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		//Logic written by Deepankar to check whether the two Strings are Anagrams.Good!! written by myself without help.
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					k++;
				}
		}	
	}
		
		//check if k is equal to the length of second string.
		if(k==str2.length()){
			System.out.println("The two String were Anagrams!");
		}else{
			System.out.println("The two Strings were not Anagrams!");
		}
}
	
}
