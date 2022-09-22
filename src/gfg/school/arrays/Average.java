package gfg.school.arrays;

// Topic: Arrays, Java

public class Average {

    // time: O(N) | space: O(1)
    static String average(int[] arr, int n) {
        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        float avg = sum / n;
        return String.format("%.2f", avg);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(average(arr, 5));
    }
}
