package com.Basics;

//String Comparision.
public class StringComparisonDemo {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1==s2); //returns true
		System.out.println(s1==s3); // returns false
		String s4 = "Ratan";
		
		/*
		 * The String compareTo() method compares values lexicographically and returns an integer value 
		 * that describes if first string is less than, equal to or greater than second string.
		 * 
		 */
		System.out.println(s1.compareTo(s2));//Returns 0
		System.out.println(s1.compareTo(s4));// Returns 1
		System.out.println(s4.compareTo(s1));// Returns -1
		
	}

}
