package gfg.school.strings;

public class Chartostr {

    static String chartostr(char arr[], int N) {
        StringBuilder str = new StringBuilder();

       for (int i = 0; i < N; i++) {
           str.append(arr[i]);
       }
       return str.toString();
    }

    public static void main(String[] args) {

    }
}
