package MapInterface;
import java.util.*;

public class MapPrac {
    public static void main(String[] args) {
        // Create a Map containing a list of items with keys and values
        Map<String, Integer> map = new HashMap<>();

        // a. Add items to the map
        map.put("Apple", 10);
        map.put("Mango", 15);
        map.put("Banana", 20);
        map.put("Papaya", 5);
        map.put("Grapes", 25);
        System.out.println("After Adding Items: " + map);

        // b. Remove items from the map
        map.remove("Mango");
        System.out.println("After Removing Mango: " + map);

        // c. Search specific key in the map
        String keyToSearch = "Papaya";
        boolean containsKey = map.containsKey(keyToSearch);
        System.out.println("Contains key " + keyToSearch + ": " + containsKey);

        // d. Get value of the specified key
        if (containsKey) {
            int value = map.get(keyToSearch);
            System.out.println("Value of key " + keyToSearch + ": " + value);
        }

        // e. Insert map elements of one map into another map
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Pineapple", 30);
        anotherMap.put("Orange", 40);
        map.putAll(anotherMap);
        System.out.println("After Adding Elements of Another Map: " + map);

        // f. Print all keys and values of the map
        System.out.println("All Keys and Values in the Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
