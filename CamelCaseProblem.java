package com.deepankarPrac;

public class CamelCaseProblem {
	//5 test cases passed and 7 failed.
	/*static int marsExploration(String s) {
        int length = s.length();
        int startIndex,endIndex=0;
        int diff=0;
        int messages = length/3;
        String[] arr = new String[messages];
        int z=0;
        for(int i=0;i<length;i+=3){
        		startIndex=i;
            	endIndex = i+3;
            	arr[z] = s.substring(startIndex,endIndex);
            	z++;
        }

        char [] c = new char[z];
        int k=0;
        for (int x1 = 0; x1 < arr.length; x1++) {        
            for (int x2 = 0; x2 < arr[x1].length(); x2++) {
                c[k] = arr[x1].charAt(x2);
                k++;
            }
        }
        
        for (int j = 0; j < c.length; j++) {
            if(c[j] != 'S'){
            	diff++;
            }else if(c[j+1] != 'O'){
            	diff++;
            }else if(c[j+2]!='S'){
            	diff++;
            }
        }
        
        return diff;
    }
*/
	
	
	//5 out of 12 test cases passed
	static int marsExploration(String s) {
        int length = s.length();
        int startIndex,endIndex=0;
        int diff=0;
        int messages = length/3;
        String[] arr = new String[messages];
        int z=0;
        for(int i=0;i<length;i+=3){
                startIndex=i;
                endIndex = i+3;
                arr[z] = s.substring(startIndex,endIndex);
                z++;
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j].equals("SOS")){
                 diff=0;
            }else{
                diff++;
            }
        }

        return diff;

    }


	public static void main(String[] args) {
		
		String s = "QQQ";
		int result = marsExploration(s);
		System.out.println(result);
		
		

	}

}
