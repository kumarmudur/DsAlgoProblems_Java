package leetcode.easy.arrays;

// Solution 1
// time: O(n^2) | space O(1)
public class MeetingRoom {

    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (overlap(intervals[i], intervals[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean overlap(int[] interval1, int[] interval2) {
        return (interval1[0] >= interval2[0] && interval1[0] < interval2[1])
                || (interval2[0] >= interval1[0] && interval2[0] < interval1[1]);
    }
}
