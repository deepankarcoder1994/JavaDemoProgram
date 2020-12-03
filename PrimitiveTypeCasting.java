package com.deepankar;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		//Assigning the value of a narrower type to a wider type is allowed in java.
		char a ='a';
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		
		//Assigning the value of wider type to a narrower type must be done explicitly via Typecasting.
		//Data loss may be possible in this Case.
		//Here int is typecasted to byte
		byte c = (byte) 261;
		System.out.println(c);
		
		
		
		//Typecasting boolean to int
		//Note:: Boolean cannot be typecasted in java to any other Primitive data types.
		/*int x1 = (int) true;
		boolean x2 = (boolean)1;
		System.out.println(x1+x2);*/
		
		
		

	}

}
