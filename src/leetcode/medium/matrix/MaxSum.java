package leetcode.medium.matrix;

public class MaxSum {

    // time: O(N^2) | space: O(1)
    static int maxSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m - 2; i++) {
            int sum = 0;
            for (int j = 0; j < n - 2; j++) {
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                sum += grid[i+1][j+1];
                sum += grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

                if (sum > result) result = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = { { 6,2,1,3 }, { 4,2,1,5 }, {9,2,8,7 }, { 4,1,2,9 }};
        System.out.println(maxSum(grid));
    }
}
