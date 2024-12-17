package JavaWildCards;
import java.util.*;

public class UpperBound {
	private static Number sum(List<? extends Number>numbers) {
		double a=0.0;
		for(Number n:numbers)
		a+=n.doubleValue();
		return a;}

	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(4,7,5,8,12);
		System.out.println(sum(list1));
		List<Double>list2=Arrays.asList(4.25,8.75,5.05,77.95,4.0);
		System.out.println(sum(list2));
	}
}
