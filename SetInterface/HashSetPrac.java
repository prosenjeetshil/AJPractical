package SetInterface;
import java.util.*;

public class HashSetPrac {
	public static void main(String[] args) {
		Set<String> hset = new HashSet<>(); // empty set created
		hset.add("apple"); // a. insert using add method
		hset.add("mango");
		hset.add("banana");
		hset.add("papaya");
		hset.add("grapes");
		System.out.println("After adding elements: "+hset);
		
		
		hset.remove("papaya"); // c. remove items using remove method
		System.out.println("After removing single element: "+hset);
		
		String search = "grapes"; // d. check if element present in set
		System.out.println("Element " + search + " present in set: "+ hset.contains(search));
		
		Set<String> hset1 = new HashSet<>(Arrays.asList("FY", "MCA", "Div")); 
		Set<String> hset2 = new HashSet<>(Arrays.asList("B", "Prosenjeet", "Shil"));
		
		// b. Insert items of one set into another set (union of sets) 
		Set<String> union = new HashSet<>(hset1); 
		union.addAll(hset2); 
		System.out.println("Union of the hset1 and hset2 Set: " + union);
	}
}

