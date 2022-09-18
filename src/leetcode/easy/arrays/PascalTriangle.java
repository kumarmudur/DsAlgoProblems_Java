package leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; ++i) result.add(1);

        for (int i = 1; i < rowIndex; ++i) {
            for (int j = i; j > 0; --j) {
                result.set(j, result.get(j) + result.get(j - 1));
                System.out.println(result);
            }
        }
        return result;
    };
     public static void main(String[] args) {
         getRow(3);
    }
}
