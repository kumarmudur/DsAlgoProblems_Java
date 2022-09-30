package gfg.medium.arrays;

// Topic: Arrays, Hash, Map, SlidingWindow

import java.util.HashMap;

public class LongestSubarraySum {

    // time: O(N) | space: O(N)
    static int lenOfLongSubarr (int A[], int N, int K) {
        int sum = 0, maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i <A.length; i++) {
            sum += A[i];
            if(sum == K) maxLength = i + 1;
            if (!map.containsKey(sum)) map.put(sum, i);
            if (map.containsKey(sum - K)) {
                if (maxLength < (i - map.get(sum - K))) {
                    maxLength = i - map.get(sum - K);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, 6, k));
    }
}
