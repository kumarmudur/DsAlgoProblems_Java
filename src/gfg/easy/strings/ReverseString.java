package gfg.easy.strings;

import java.util.*;

public class ReverseString {

    static String conReverse(String S1, String S2) {
        System.out.println("S1 " + S1);
        System.out.println("S2 " + S2);
        String S3 = S1.concat(S2);
        String revStr = "";
        System.out.println("S3 " + S3);

        for (int i = 0; i < S3.length(); i++) {
            revStr = S3.charAt(i) + revStr;
        }

        System.out.println("revStr " + revStr);
        return "";
    }

    public static void main(String[] args) {
        conReverse("Geeks", "forGeeks");
    }
}
