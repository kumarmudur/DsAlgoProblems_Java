package leetcode.easy.strings;

// String

public class LicenseKeyFormatting {

    // time: O(N) | space: O(1)
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        int n = s.length();
        StringBuilder result = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                result.append(Character.toUpperCase(s.charAt(i)));
                count++;
                if (count == k) {
                    result.append('-');
                    count = 0;
                }
            }
        }

        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {
            result = new StringBuilder(result.substring(0, result.length() - 1));
        }

        result.reverse();
        return result.toString();
    }
}
