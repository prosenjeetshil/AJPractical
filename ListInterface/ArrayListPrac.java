package ListInterface;
import java.util.*;

public class ArrayListPrac {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("FY");
	    list.add("MCA");
        list.add("Div B");
	    System.out.println("ArrayList:" + list);
	    for(String s:list){  
	    	System.out.println(s);  
	    }  
	}
}