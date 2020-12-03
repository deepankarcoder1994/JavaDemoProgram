package com.Basics;

public class StringClassMethodsDemo {

	public static void main(String[] args) {
		//Intern() method
		String s = new String("Sachin");
		String s2 = s.intern();
		System.out.println(s2);
		
		//valueOf() method
		int a = 10;
		String s1 = String.valueOf(a);
		System.out.println(s1+10);
	}

}
