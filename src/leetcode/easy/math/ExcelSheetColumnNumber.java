package leetcode.easy.math;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {

    // Solution 1
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        Map<Character, Integer> alpha_map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            int c = i + 65;
            alpha_map.put((char) c, i + 1);
        }

        int n = columnTitle.length();
        for (int i = 0; i < n; i++) {
            char cur_char = columnTitle.charAt(n - 1 - i);
            result += (alpha_map.get(cur_char) * (Math.pow(26, i)));
        }
        return result;
    }

    // Solution 2
    public static int titleToNumber1(String columnTitle) {
        int result = 0;
        int n = columnTitle.length();
        for (int i = 0; i < n; i++) {
            result = result * 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber1("A"));
    }
}
