package gfg.school.arrays;

public class PalinArray {

    // time: O(N^2) | space: O(N)
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int temp = 0, sum = 0, remainder = 0;
            temp = a[i];

            while (temp != 0) {
                remainder = temp % 10;
                sum = sum * 10 + remainder;
                temp = temp / 10;
            }
            if (a[i] != sum) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 111, 222, 333, 444, 555 };
        System.out.println(palinArray(arr, 5));
    }
}
