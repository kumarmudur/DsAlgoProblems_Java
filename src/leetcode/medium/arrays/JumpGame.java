package leetcode.medium.arrays;

public class JumpGame {

    // time: O(N) | space: O(1)
    static boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int max = 0;

        for (int i = 0; i <= max; i++) {
            max = Math.max(max, i + nums[i]);
            if (max >= n - 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 0, 4, 5};
        System.out.println(canJump(nums));
    }
}
