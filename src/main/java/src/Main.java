package src;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int value) {
        int answerValue = 1;
        for (int i = 2; i <= value; i++) {
            answerValue *= i;
        }
        return answerValue;
    }
}
