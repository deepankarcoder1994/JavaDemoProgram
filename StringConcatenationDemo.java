package com.Basics;

public class StringConcatenationDemo {

	/*In java, String concatenation is implemented through the StringBuilder (or StringBuffer) class 
	 * and its append method
	 */
	public static void main(String[] args) {
		// String Concatenation by + (string concatenation) operator
		String s = 50 + 30 + "Sachin" + 40+ 40;
		System.out.println(s);
		//String Concatenation by concat() method
		String s1 = "Deepankar";
		String s2 ="Sharma";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

}
