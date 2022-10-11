package leetcode.medium.arrays;

import java.util.Arrays;

public class RearrangeArray {

    // time: O(N) | space: O(N)
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int start = 0;
        int end = 1;

        for (int num : nums) {
            if (num >= 0) {
                result[start] = num;
                start += 2;
            } else {
                result[end] = num;
                end += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3,1,-2,-5,2,-4 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
