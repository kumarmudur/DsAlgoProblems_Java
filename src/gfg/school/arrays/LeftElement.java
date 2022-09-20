package gfg.school.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LeftElement {

    // time: O(NlogN) | space: O(1)
    static long leftElement(long[] arr, long n) {
        Arrays.sort(arr);
        if(n%2==0){
            return arr[(int)((n / 2) - 1)];
        }
        else{
            return arr[(int)(n / 2)];
        }
    };

    public static void main(String[] args) {
        long[] arr = { 7, 8, 3, 4, 2, 9, 5 };
        long N = 7;
        System.out.println(leftElement(arr, 7));
    }
}
