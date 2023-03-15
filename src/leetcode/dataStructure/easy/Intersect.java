package leetcode.dataStructure.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Intersect {

    // time: O(n + m) | space: O(min(n, m)
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n: nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        int k = 0;
        for (int n: nums2) {
            int count = m.getOrDefault(n, 0);
            if (count > 0) {
                nums1[k++] = n;
                m.put(n, count -1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
