package LambdaPractical;

public class LambdaMultipleParameters {
    public static void main(String[] args) {
        Addition add = (a, b) -> a + b;
        int number1 = 10;
        int number2 = 20;
        int result = add.operate(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }

    @FunctionalInterface
    interface Addition {
        int operate(int a, int b);
    }
}
