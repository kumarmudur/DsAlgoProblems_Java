package leetcode.easy.math;

// Topic: Math, Bit Manipulation

public class NumberOfSteps {

    static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(6));
    }
}
