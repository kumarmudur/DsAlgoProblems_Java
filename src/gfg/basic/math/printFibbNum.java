package gfg.basic.math;

// Topic: Math

import java.util.Arrays;

public class printFibbNum {

    // time: O(N) | space: O(N)
    static long[] printFibbNum(int n) {
        long fn = 1;
        long sn = 1;

        long[] result = new long[n];

        for (int i = 0; i < n; i++) {
            result[i] = fn;
            long temp = fn;
            fn = sn;
            sn += temp;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFibbNum(5)));
    }
}
