package com.deepankar;

import java.util.Scanner;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		//Replace the spaces of a string with specific character
		if(str.contains(" ")){
			str = str.replaceAll(" ","Vidu");
		}
		
		System.out.println(str);

	}

}
