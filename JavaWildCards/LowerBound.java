package JavaWildCards;
import java.util.Arrays;
import java.util.List;

public class LowerBound {
	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(4,7,5,8,12);
		superClass(list1);
		
		List<Number>list2=Arrays.asList(5,9,51,7,42);
		superClass(list2);
	}
	
	public static void superClass(List<? super Integer>list) {
		System.out.println(list);
	
	}
}
