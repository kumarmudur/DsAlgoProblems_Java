package gfg.easy.strings;

public class RevStr3 {

    public static String reverseStr(String s, int k) {
        System.out.println("s = " + s);

        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i = i+(2*k)) {
            int start = i, end = Math.min(i + k - 1, c.length - 1);
            while (start < end) {
                char temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String s = reverseStr("abcdefg", 2);
        System.out.println("Rev = " + s);
    }
}
