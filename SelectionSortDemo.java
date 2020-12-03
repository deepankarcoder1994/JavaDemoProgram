package com.deepankarsharma;


//Selection Sort Implementation.
public class SelectionSortDemo {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex > 0;lastUnsortedIndex--){
			int largest = 0;
			
			for(int i=1; i<= lastUnsortedIndex;i++){
				if(intArray[i] > intArray[largest]){
					largest = i;
				}
			}
			
			swap(intArray,largest,lastUnsortedIndex);
			
		}
		
		//Printing the Sorted Array.
		System.out.println("Sorted Array is : ");
		for(int i=0;i<intArray.length;i++){
			System.out.println(" " + intArray[i]);
		}
	}
	
	//Swap method
		public static void swap(int[] array, int i, int j){
			
			if(i == j){
				return;
			}
			
			int temp = array[i];
			array[i] = array[j];	
			array[j] = temp;
		}


}
