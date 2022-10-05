package leetcode.medium.tree;

// Topic: Tree, Math, DP

public class UniqueBinarySearchTree {

    static int uniqueBinarySearchTree(int n) {
        if (n < 2) return 1;
        int[] result = new int[n + 1];
        result[0] = 1; result[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; ++j) {
                result[i] += result[j] * result[i - j - 1];
            }
        }
        return result[n];
    }

    public static void main(String[] args) {
        System.out.println(uniqueBinarySearchTree(3));
    }

}
