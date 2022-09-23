package gfg.school.arrays;

// Topic: Math

public class Mean {

    // time: O(N) | space: O(1)
    static int mean(int N, int[] A) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return Math.round(sum / N);
    }

    public static void main(String[] args) {
        int[] arr = { 56 , 67 , 30 , 79 };
        System.out.println(mean(4, arr));
    }
}
