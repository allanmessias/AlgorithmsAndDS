package Algorithms;

import java.util.LinkedList;
import java.util.Stack;

public class BinarySearch {

	public static void main(String[] args) {

	}
	
	public static int binarySearch(int[] array, int start, int end, int target) {
		if(start > end) throw new IllegalStateException("Target was not found");
		
		int midIndex = (int) Math.floor((start + end) / 2); 
		if(array[midIndex] == target) return target; 
		
		if(array[midIndex] > target) return binarySearch(array, start, midIndex - 1, target);
		
		return binarySearch(array, midIndex + 1, end, target); 
	}
}
