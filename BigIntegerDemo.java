package com.deepankarPrac;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("22");
		BigInteger divide = bigInteger.multiply(new BigInteger("55")).add(new BigInteger("13"))
				                      .divide(BigInteger.valueOf(12));
		System.out.println(divide);
	
	}

}
