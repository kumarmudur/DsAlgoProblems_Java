package leetcode.easy.bitManipulation;

// Bit Manipulation

public class HammingDistance {

    // time: O(1) | space: O(1)
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
