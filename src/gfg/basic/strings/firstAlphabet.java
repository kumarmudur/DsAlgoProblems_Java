package gfg.basic.strings;

public class firstAlphabet {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        String[] str = S.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : str) {
            result.append(s.charAt(0));
        }
        System.out.println("result " + result);
    }
}
