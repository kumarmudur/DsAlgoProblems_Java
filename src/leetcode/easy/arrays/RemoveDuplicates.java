package leetcode.easy.arrays;

public class RemoveDuplicates {

    // time: O(N) | space: O(1)
    static int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
}
