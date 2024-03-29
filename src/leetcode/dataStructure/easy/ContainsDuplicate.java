package leetcode.dataStructure.easy;

// Topic: Arrays, Sorting, Hash Table

public class ContainsDuplicate {

    // Solution 1
    // time: O(n^2) | space: O(1)
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        containsDuplicate(new int[]{1, 2, 3, 4});
    }
}
