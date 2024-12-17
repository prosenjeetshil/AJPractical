package JavaWildCards;
import java.util.Arrays;
import java.util.List;

public class Unbounded {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(69, 125, 131);
		List<Double> list2 = Arrays.asList(6.9, 12.5, 13.1);
		printlist(list1);
		printlist(list2);
	}

	private static void printlist(List<?> list) {
		System.out.println(list);
	}
}
