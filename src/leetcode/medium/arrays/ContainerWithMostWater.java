package leetcode.medium.arrays;

public class ContainerWithMostWater {

    // time: O(N^2) | space: O(1)
    static int maxArea(int[] height) {
        int maxAreaResult = 0;
        int length = height.length;
        for (int left = 0; left < length; left++) {
            for (int right = left + 1; right < length; right++) {
                int width = right - left;
                maxAreaResult = Math.max(maxAreaResult, Math.min(height[left], height[right]) * width);
            }
        }
        return maxAreaResult;
    }

    static int maxArea1(int[] height) {
        int maxAreaResult = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            maxAreaResult = Math.max(maxAreaResult, Math.min(height[left], height[right]) * width);
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return maxAreaResult;
    }

    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7 };
        System.out.println(maxArea1(height));
    }
}
