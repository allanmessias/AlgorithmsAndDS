package LeetCode;

public class MaxSubArray {
	 public static int maxSubArray(int[] nums) {
		 int max = Integer.MIN_VALUE;
		 int sum = 0;
		 
		 for (int i = 0; i < nums.length; i++) {
			 sum += nums[i]; 
			 max = Math.max(max, sum);
			 
			 if(sum < 0) sum = 0;
		 }
		 return max; 
	}
	 
	 public static void main(String[] args) {
		MaxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		MaxSubArray.maxSubArray2(new int[] {-2,1,-3,4,-1,2,1,-5,4});
	}
	
	 
	  public static int maxSubArray2(int[] nums) {
	        int maxSum = nums[0];
	        int currentSum = maxSum;
	        for(int i = 1; i < nums.length; i++) {
	           currentSum = Math.max(nums[i] + currentSum, nums[i]);
	           maxSum = Math.max(currentSum, maxSum); 
	           
	        }
	        return maxSum; 
	    }
}
