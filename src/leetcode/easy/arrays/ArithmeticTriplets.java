package leetcode.easy.arrays;

public class ArithmeticTriplets {

    // time: O(N^3) | space: O(1)
    static int arithmeticTriplets(int[] arr, int diff) {
        int count = 0;
        int length = arr.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (arr[j] - arr[i] == diff && arr[k] - arr[j] == diff) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,4,6,7,10 };
        int diff = 3;
        System.out.println(arithmeticTriplets(arr, diff));
    }
}
