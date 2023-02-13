package leetcode.easy.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    // time: O(N) | space: O(N)
    static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    // time: O(N) | space: O(N)
    static boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i: nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,1,3,3,4,3,2,4,2 };
        System.out.println(containsDuplicate(nums));
    }
}
