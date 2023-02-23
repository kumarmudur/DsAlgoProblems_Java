package leetcode.programmingSkills.easy.operator;

public class HammingWeight {

    // Solution 1
    // time: O(1) | Space: O(1)
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) bits++;
            mask <<= 1;
        }
        return bits;
    }
}
