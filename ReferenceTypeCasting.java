package com.deepankar;

public class ReferenceTypeCasting {

	public static void main(String[] args) {
		Integer a = 123;
		//This assignement is possible because Object class is the superclass of Integer Class
		Object b = a;
		//But again if we reasssign b to a, it means we are assigning Parent class(Object class) to child class which is not possible, so we
		//need to explicitly typecast it
		a=(Integer)b;
		System.out.println(a);

	}

}
