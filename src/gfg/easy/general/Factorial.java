package gfg.easy.general;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;

        for (int i = 5; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("factorial " + factorial);
    }
}
