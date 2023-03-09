package leetcode.dataStructure.easy;

public class MaxSubArray {

    // Solution 1
    // time: O(n^2) | space: O(1)
    public int maxSubArray(int[] nums) {
        int maxSubarray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSubarray = Math.max(maxSubarray, currentSum);
            }
        }
        return maxSubarray;
    }
}
