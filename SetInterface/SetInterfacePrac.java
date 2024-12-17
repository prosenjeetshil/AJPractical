package SetInterface;

import java.util.*;

public class SetInterfacePrac {
	public static void main(String[] args) {
		 Set<String> items = new
		 HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		 
		 System.out.println("Items in the Set:"); 
		 Iterator<String> iterator = items.iterator();
		 
		 while (iterator.hasNext()) {
		 System.out.println(iterator.next()); 
		 } 
		 System.out.println();
		 
		 List<String> itemList = new ArrayList<>(items);
		 Collections.reverse(itemList);
		 System.out.println("Items in reverse order:"); 
		 iterator = itemList.iterator(); 
		 
		 while (iterator.hasNext()) {
		 System.out.println(iterator.next());
		 }
	}
}
