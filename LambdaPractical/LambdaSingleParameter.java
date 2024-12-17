package LambdaPractical;

public class LambdaSingleParameter {
    public static void main(String[] args) {
        Square square = x -> x * x;
        int number = 5;
        int result = square.calculate(number);
        System.out.println("The square of " + number + " is: " + result);
    }
    
    @FunctionalInterface
    interface Square {
        int calculate(int x);
    }
}
