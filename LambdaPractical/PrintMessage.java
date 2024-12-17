package LambdaPractical;

public class PrintMessage {
	interface Hello {
		void hello();
	}
	public static void main(String[] args) {
		Hello obj = () -> System.out.print("Hello World!");
		obj.hello();
	}
}
