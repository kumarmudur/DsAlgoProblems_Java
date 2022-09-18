package gfg.easy.strings;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        System.out.println("s " + s);
        System.out.println("t " + t);

        if (s.length() != t.length()) return false;

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int i: counts) {
           if (i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagra", "nagaram"));
    }
}
