package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindTargetsIndicesAfterSortArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessThan = 0;
        for(int n : nums) {
            if(n == target) count++;
            if(n < target) lessThan++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = lessThan; i < count + lessThan; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FindTargetsIndicesAfterSortArray.targetIndices(new int[] {1,2,5,2,3}, 2));
    }
}
