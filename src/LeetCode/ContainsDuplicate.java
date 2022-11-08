package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
//	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	 public static boolean containsDuplicate(int[] nums) {
		 	if(nums.length < 2) return false; 
		 	
		 	HashSet<Integer> hashSet = new HashSet<Integer>(); 
		 	
		 	for(int i = 0; i <= nums.length; i++) {
		 		if(hashSet.contains(nums[i])) { 
		 			return true; 
		 		}
		 		hashSet.add(nums[i]);
		 	}
		 	return false; 
	   }
	 
	 public static void main(String[] args) {
		ContainsDuplicate.containsDuplicate(new int[] {1, 2, 3, 2, 4}); 
	}
}
