package leetcode.easy.arrays;

// Topic: Array

import java.util.Arrays;

public class ArrayPairSum {

    // time: O(N) | space: O(1)
    static int arrayPairSum(int[] nums) {
        int maxSum = 0;
        int length = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < length; i += 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1,4,3,2 };
        System.out.println(arrayPairSum(nums));
    }
}
