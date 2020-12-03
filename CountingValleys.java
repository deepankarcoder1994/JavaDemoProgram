package com.deepankarPrac;

import java.util.Scanner;

public class CountingValleys {
	
	static int countingValleys(int n, String s) {
				 int noOfValleys = 0;
				 int currentStep = 0, prevStep = 0;
				 for(int i = 0; i < s.length(); i++){
				  if(s.charAt(i) == 'D'){
				   prevStep = currentStep;
				   currentStep--;
				  }
				  else if(s.charAt(i) == 'U'){
				   prevStep = currentStep;
				   currentStep++;
				  }
				if(currentStep == 0 && prevStep == -1)
				   noOfValleys++;
				 }
				 return noOfValleys;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the String");
		int n = sc.nextInt();
		System.out.println("Enter the String!!");
		String str = sc.next();
		int result = countingValleys(n,str);
		System.out.println(result);
		

	}

}
