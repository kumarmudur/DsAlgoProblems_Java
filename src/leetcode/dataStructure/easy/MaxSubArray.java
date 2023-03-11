package leetcode.dataStructure.easy;

public class MaxSubArray {

    private int[] numsArray;

    // Solution 1
    // time: O(n^2) | space: O(1)
    public int maxSubArray(int[] nums) {
        int maxSubarray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSubarray = Math.max(maxSubarray, currentSum);
            }
        }
        return maxSubarray;
    }

    // Solution 2
    // time: O(N⋅logN) | space: O(logN)
    public int maxSubArray1(int[] nums) {
        numsArray = nums;
        return findBestSubArray(0, numsArray.length - 1);
    }

    private int findBestSubArray(int left, int right) {
        if (left > right) return Integer.MIN_VALUE;

        int mid = Math.floorDiv(left + right, 2);
        int curr = 0;
        int bestLeftSum = 0;
        int bestRightSum = 0;

        for (int i = mid - 1; i >= left; i--) {
            curr += numsArray[i];
            bestLeftSum = Math.max(bestLeftSum, curr);
        }

        curr = 0;
        for (int i = mid + 1; i <= right; i++) {
            curr += numsArray[i];
            bestRightSum = Math.max(bestRightSum, curr);
        }

        int bestCombinedSum = numsArray[mid] + bestLeftSum + bestRightSum;

        int leftHalf = findBestSubArray(left, mid - 1);
        int rightHalf = findBestSubArray(mid + 1, right);

        return Math.max(bestCombinedSum, Math.max(leftHalf, rightHalf));

    }
}
