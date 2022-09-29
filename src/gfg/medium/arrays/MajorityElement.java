package gfg.medium.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // time: O(N) | space: O(N)
    static int majorityElement(int[] arr, int size) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
               map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > size / 2) result = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3,1,3,3,2 };
        int N = 5;
        System.out.println(majorityElement(arr, N));
    }
}
