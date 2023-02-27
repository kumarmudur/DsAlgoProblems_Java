package leetcode.programmingSkills.easy.conditional;

// Topic: Arrays

public class NearestValidPoint {

    public int nearestValidPoint(int x1, int y1, int[][] points) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0; i < points.length;i++){
            int x2 = points[i][0];
            int y2 = points[i][1];
            if (x1 == x2 || y1 == y2) {
                int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                if (min > distance) { min = distance; minIndex = i; }
            }
        }
        return minIndex;
    }
}
