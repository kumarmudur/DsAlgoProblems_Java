package gfg.easy.pattern_searching;

// Topic: Pattern-Searching

public class HelpIsShan {

    static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int NthTerm(int N)
    {
        if (N == 1) return 1;

        if (checkPrime(N)) return 0;

        int diff = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            int t = 0;

            t = N + i;
            if (checkPrime(t)) return Math.abs(N-t);

            t = N - i;
            if (checkPrime(t)) return Math.abs(N-t);
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(NthTerm(10));
    }
}
