package gfg.school.arrays;

import java.util.Arrays;

public class Fascinating {

   static boolean fascinating(long n) {
        String num = String.valueOf(n);
        if(num.length() < 3) return false;
        else {
            long n1 = n * 2;
            long n2 = n * 3;

            String r = n1 + n2 + num;
            char[] ch = r.toCharArray();
            Arrays.sort(ch);
            return String.valueOf(ch).equals("123456789");
        }
    }

    public static void main(String[] args) {
        System.out.println(fascinating(192));
    }

}
