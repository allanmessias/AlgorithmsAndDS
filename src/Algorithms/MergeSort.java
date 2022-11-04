package Algorithms;

import java.util.Arrays;

public class MergeSort {
	public void mergeSort(int[] array) {
		int inputLength = array.length; 
		
		if(inputLength < 2) {
			return;
		}
		
		int midIndex = array.length / 2; 
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftArray[i] = array[i];
		}
	
		for(int i = midIndex; i < inputLength; i++) {
			rightArray[i - midIndex] = array[i]; 
		}
//		
		mergeSort(leftArray);
		mergeSort(rightArray);
//		
//		merge(array, leftArray, rightArray, n - midIndex);
	}
	
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] array = {1, 2, 6, 3, 5, 4, 24, 12, 11, 10, 32};
		mergeSort.mergeSort(array);
	}
}
