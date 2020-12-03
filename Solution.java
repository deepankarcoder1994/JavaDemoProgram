package com.deepankarPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxAmountSpent =0;
        List<Integer> myList = new ArrayList<>();
        int len = keyboards.length;
        int len1 = drives.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
               if(keyboards[i] + drives[j]<= b){
                   myList.add(keyboards[i] + drives[j]);
               }
            }
        }

        if(myList.size() == 0){
            return -1;
        }
          else{
                    for(int k :myList){
                   maxAmountSpent = Collections.max(myList);
               }

               return maxAmountSpent;
          }
    }

	public static void main(String[] args) {
		
		

	}

}
