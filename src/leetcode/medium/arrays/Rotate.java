package leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Rotate {

    // time:O(N) | space: O(1)
    static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println("nums" + Arrays.toString(nums));
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7 };
        rotate(arr, 3 );
    }
}
