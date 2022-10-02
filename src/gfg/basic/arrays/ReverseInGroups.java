package gfg.basic.arrays;

//Topic: Arrays

import java.util.Arrays;

public class ReverseInGroups {

    // time: O(N) | space: O(1)
    static void reverseInGroups(int[] arr, int k) {
        int length = arr.length;
        for (int i = 0; i < length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, length - 1);
            int temp;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("arr" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        reverseInGroups(arr, k);
    }
}
