package gfg.medium.arrays;

import java.util.Arrays;

public class FindDuplicateNum {

    public static int findDuplicate(int[] nums) {
        System.out.println("nums " + Arrays.toString(nums));
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,2, 1};
        System.out.println(findDuplicate(nums));
    }
}
