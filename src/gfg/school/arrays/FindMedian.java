package gfg.school.arrays;

// Topic: Math, Divide & Conquer, Array

import java.util.Arrays;

public class FindMedian {

    static int findMedian(int[] arr) {
        int n = arr.length;
        int result;

        Arrays.sort(arr);

        if (n % 2 != 0) result = arr[n / 2];
        else result = (arr[n / 2] + arr[n / 2 - 1]) / 2;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 90, 100, 78, 89, 67 };
        System.out.println(findMedian(arr));
    }
}
