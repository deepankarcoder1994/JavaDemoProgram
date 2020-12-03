package com.deepankarPrac;

import java.util.Scanner;

public class Gemstones {
	
	 static int gemstones(String[] arr) {
	        int gemstones = 0;
	        char[][] array = new char[arr.length][];
	        for(int i=0;i<arr.length;i++){
	           array[i] = arr[i].toCharArray();
	        }
	        
	        for(int i=0;i<arr.length;i++){
		           System.out.println(array[i]);
		        }
			return gemstones;
	        
	        
	        
	 }  

	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scanner.nextInt();
       
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }
		int res = gemstones(arr);
		System.out.println(res);

	}

}
