package leetcode.programmingSkills.easy.dataType;

public class CountOdds {

    // Solution 1
    public int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) count++;
        }
        return count;
    }

    // Solution 2
    public int countOdds1(int low, int high) {
        if ((low & 1) == 0) low++;

        return low > high ? 0 : (high - low) /  2 + 1;
    }

    public static void main(String[] args) {

    }
}
