package leetcode.medium.math;

import java.util.Arrays;

public class CountPrimes {

    // time: O(N) | space: O(N)
    static int countPrimes(int n) {
        if ( n < 2) return 0;
        boolean[] primes = new boolean[n];
        int limit = (int)Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {
            if (!primes[i]) {
                for (int j = i * i; j < n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
