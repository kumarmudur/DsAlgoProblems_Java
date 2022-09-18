package leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static List<int[]> merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        System.out.println(intervals);
        return result;
    };

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        merge(intervals);
    }
}
