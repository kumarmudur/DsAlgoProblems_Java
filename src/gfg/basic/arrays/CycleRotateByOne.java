package gfg.basic.arrays;

import java.util.Arrays;

public class CycleRotateByOne {

    static int[] cycleRotateByOne (int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(cycleRotateByOne(arr)));
    }
}
