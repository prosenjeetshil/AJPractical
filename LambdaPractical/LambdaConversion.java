package LambdaPractical;

public class LambdaConversion {
    public static void main(String[] args) {
        DistanceConverter kilometersToMiles = kilometers -> kilometers * 0.621371;

        double kilometers = 5.0;
        double miles = kilometersToMiles.convert(kilometers);

        System.out.println(kilometers + " Kilometers is " + miles + " Miles");
    }

    @FunctionalInterface
    interface DistanceConverter {
        double convert(double distance);
    }
}
