package leetcode.medium.strings;

public class ZigZag {

    public static String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }
        int i = 0;
        while (i < length) {
            for (int idx = 0; idx < nRows && i < length; idx++) {
                sb[idx].append(c[i++]);
            }
            for (int idx = nRows - 2; idx >= 1 && i < length; idx--) {
                sb[idx].append(c[i++]);
            }
        }
        for (int idx = 1; idx < sb.length; idx++) {
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING", 3);
    }
}
