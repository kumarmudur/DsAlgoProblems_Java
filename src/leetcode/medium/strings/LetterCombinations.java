package leetcode.medium.strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    // time: O(3^M * 4^N) | space: O(3^M * 4^N)
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }

        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (char digit : digits.toCharArray()) {
            String curLetters = letters[digit - '2'];
            List<String> newRes = new ArrayList<>();

            for (String item : res) {
                for (char curDigit : curLetters.toCharArray()) {
                    newRes.add(item + curDigit);
                }
            }
            res = newRes;
        }
        return res;
    }
}
