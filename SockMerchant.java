package com.deepankarPrac;

public class SockMerchant {
	
	//Wrote this code snippet by Myself(only 1 test case passed)
	 static int sockMerchant(int n, int[] ar) {
	        int pairs =0;
	         int[] count = new int[n];
	         for(int i=0;i<n;i++){
	             for(int j=i+1;j<n-1;j++){
	                 if(ar[i] == ar[j]){
	                     count[i]++;
	                     break;
	                 }
	             }
	             
	         }

	         for(int k=0;k<count.length;k++){
	             if(count[k]%2 == 0){
	                 pairs++;
	             }
	         }

	         return pairs;
	    }

	public static void main(String[] args) {
		

	}

}
