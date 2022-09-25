package gfg.easy.arrays;

public class ArraySortedOrNot {

    // time: O(N) | space: O(1)
    static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        System.out.println(arraySortedOrNot(arr, n));
    }
}
