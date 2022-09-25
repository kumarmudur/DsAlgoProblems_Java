package leetcode.easy.arrays;

public class CheckArraySorted {

    // time: O(N^2) | space: O(1)
    static boolean checkIsSortedArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { 3,4,5,1,2 };
        System.out.println(checkIsSortedArray(arr));
    }
}
