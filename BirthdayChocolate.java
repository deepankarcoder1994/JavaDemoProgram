package com.deepankarPrac;

import java.util.List;

public class BirthdayChocolate {
	//Original function written by myself
	static int birthday(List<Integer> s, int d, int m) {
        int ways =0;
        int arr[] =  new int[s.size()];
        for (int i =0; i < s.size(); i++) 
            arr[i] = s.get(i);
        int len = arr.length;
        if(len==1 && arr[len-1] ==d){
            ways++;
            return ways;
        }else if(len!=1){
        for(int j=0;j<len-1;j++){
            for(int k=j+1;k<len-1;k++){
                if(arr[j] + arr[k] == d){
                    ways++;
            }
                
            }
        }
    }

        return ways;
    }

	public static void main(String[] args) {
		

	}

}
