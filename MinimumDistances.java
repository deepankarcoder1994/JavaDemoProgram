package com.deepankarPrac;

public class MinimumDistances {
	
	static int minimumDistances(int[] a) {
        int len = a.length;
        int[] min = new int[len];
        int[] indexes = new int[len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
            		if(a[i] == a[j]){
                         min[i] = Math.abs(i-j);
            	}    
             }
            
        }
    /*int min=-1;
    for(int x1=0;x1<indexes.length-1;x1+=2){
        if(Math.abs(indexes[x1] - indexes[x1+1]) < min){
            min = Math.abs(indexes[x1] - indexes[x1+1]);
        }
        
       
    }*/
        int min1 = min[0];
        for(int j=1;j<min.length;j++){
        	if(min1 > min[j]){
        		min1 = min[j];
        	}
        }
    
    return min1;
}


	public static void main(String[] args) {
	 int[] arr = {7 ,1, 3, 4, 1, 7};
	 int res = minimumDistances(arr);
	 System.out.println(res);

	}

}
