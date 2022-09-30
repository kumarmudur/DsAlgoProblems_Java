package leetcode.medium.arrays;

// Topic: Array, Hash Table, Prefix Sum

import java.util.HashMap;

public class SubarraySum {

    // time: O(N) | space: O(N)
    static int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                System.out.println();
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}
