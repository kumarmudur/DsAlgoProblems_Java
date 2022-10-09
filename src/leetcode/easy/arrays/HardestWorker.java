package leetcode.easy.arrays;

public class HardestWorker {

    // time: O(N) | space: O(1)
    static int hardestWorker(int n, int[][] logs) {
        int max = 0, maxIndex = -1, current = 0;

        for (int[] log : logs) {
            int time = log[1] - current;
            current = log[1];
            if (time > max) {
                max = time;
                maxIndex = log[0];
            } else if (time == max) {
                maxIndex = Math.min(maxIndex, log[0]);
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] logs = { { 0, 3}, { 2, 5}, { 0, 9}, { 1, 15 }};
        System.out.println(hardestWorker(n, logs));
    }
}
