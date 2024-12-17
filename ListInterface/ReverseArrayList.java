package ListInterface;
import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("FY");
	    list.add("MCA");
        list.add("Div B");
	    System.out.println("ArrayList:" + list);
	    
	    ListIterator<String> listIterator = list.listIterator();
	    
	    System.out.println("Travesing the List: ");
	    while(listIterator.hasNext()) {
	    	System.out.println(listIterator.next());
	    }
	    System.out.println();
	    System.out.println("Travesing the List in reverse: ");
	    while(listIterator.hasPrevious()) {
	    	System.out.println(listIterator.previous());
	    }
	}
}
