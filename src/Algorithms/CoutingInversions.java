package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CoutingInversions {
	public static int mergeAndCount(int[] array, int left, int medium, int right) {
		if(array.length == 1) return 0; 
		
		int[] leftSubArray = Arrays.copyOfRange(array, left, medium + 1);
		int[] rightSubArray = Arrays.copyOfRange(array, medium + 1, right + 1);
		
		int i = 0, j = 0, k = 1, swaps = 0; 
		
		while(i < leftSubArray.length && j < rightSubArray.length) {
			if (leftSubArray[i] < rightSubArray[j]) {
				array[k++] = leftSubArray[i++]; 
			} else {
				array[k++] = rightSubArray[j++];
				swaps += (medium + 1) - (left + 1); 
			}
		}
		
		while(i < leftSubArray.length) {
			array[k++] = leftSubArray[i++];
		}
		while(j < rightSubArray.length) {
			array[k++] = rightSubArray[j++];
		}
		return swaps;
	}
	
	public static int enhMergeCountInv(int[] arr, int left, int right) {
		int countInv = 0;
		if(left < right) {
			int mid = (left + right) / 2;
			
			countInv += enhMergeCountInv(arr, left, mid); 
			countInv += enhMergeCountInv(arr, mid + 1, right);
			countInv += mergeAndCount(arr, left, mid, right);
		}
		
		return countInv; 
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Size of Array:");
	    int n = sc.nextInt();
	    int arr[] = new int[n];

	    System.out.println("Enter Array:");
	    for (int x = 0; x < n; x++)
	      arr[x] = sc.nextInt();
	    System.out.println("\nInversion Count:" +
	      enhMergeCountInv(arr, 0, arr.length - 1)); 
	}
	
}
