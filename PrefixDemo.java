package com.deepankar;

public class PrefixDemo {

	public static void main(String[] args) {
		//0x is a Prefix in java which tells the JVM that the literal is a Hexadecimal
		int a = 0x2A;
		System.out.println(a);
		
		//The Prefix 0 tells the compiler to treat 52 as an Octal or base 8 representation
		int b = 052;
		System.out.println(b);
		
		/*Result In error because java , by default Interprets a Literal Number with a Fractional part as a 
		double floating Number.
		float e = 1.23451234512345;
		System.out.println(e);*/
		
		//to correct this we need to append the letter f at the end of the number, but only till 7 decimal points it will print the result.
		float x2 = 1.23451234512345f;
		System.out.println(x2);
		
		
		double x3 = 1.23451234512345;
		System.out.println(x3);
		
		/***
		 * Learning from this Tutorial
		 * Literal Values are Interpreted and stored in primitive types.Information Loss is possible in this Process.
		 * 
		 * 
		 */
		
		

	}

}
