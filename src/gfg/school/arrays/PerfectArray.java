package gfg.school.arrays;

public class PerfectArray {

    // time: O(N) | space: O(1)
    static boolean perfectArray(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.println(perfectArray(arr, 5));
    }
}
