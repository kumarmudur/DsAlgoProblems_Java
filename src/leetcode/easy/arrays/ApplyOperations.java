package leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplyOperations {

    // time: O(N) | space: O(N)
    static int[] applyOperations(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int  i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int count = 0;
        for (int num : nums) {
            if (num == 0) count++;
        }

        for (int num : nums) {
            if (num != 0) list.add(num);
        }

        for (int i = 0; i < count; i++) list.add(0);

        for (int i = 0; i < list.size(); i++) nums[i] = list.get(i);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,2,1,1,0 };
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}
