package com.deepankar;

public class ReferenceTypesDemo {

	//variable a is of Object reference type, so if we print it will return zero.
	//static Integer a;
	public static void main(String[] args) {
		//Three ways of creating a wrapper Object using a primitive value
		int a = 123;
		Integer b = new Integer(a);
		Integer c = new Integer("123");
		Integer d = Integer.parseInt("123");
		//The below is the concept of Autoboxing.Java does the type conversion for us automatically
		//when we assign a primtive int to Integer reference type.
		Integer e = a;
		System.out.println(a+" " +b);
		
		System.out.println(c+" " +d + " " + e);
		
	}

}
