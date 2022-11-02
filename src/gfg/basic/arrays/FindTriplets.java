package gfg.basic.arrays;

import java.util.HashSet;

public class FindTriplets {

    // time: O(N^2) | space: O(N)
    static boolean findTriplets(int arr[], int n) {
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (set.contains(x)) return true;
                else set.add(arr[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= { 0, -1, 2, -3, 1 };
        System.out.println(findTriplets(arr, 5));
    }
}
