package LambdaPractical;

public class LambdaReturn {
	public static void main(String[] args) {
        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println("Without Return: "+ ad1.add(80, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("With Return: "+ ad2.add(800, 200));
    }
}

interface Addable {
    int add(int a, int b);
}
