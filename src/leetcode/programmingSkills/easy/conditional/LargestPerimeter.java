package leetcode.programmingSkills.easy.conditional;

import java.util.Arrays;

public class LargestPerimeter {

    // Solution 1
    // time: O(n) | space: O(1)
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i-1] + nums[i-2]) return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}
