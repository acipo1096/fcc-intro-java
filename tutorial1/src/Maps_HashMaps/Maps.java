package Maps_HashMaps;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Maps {
    public static void main(String[] args) {
        // Think of a Map like a Python dictionary
        // A MAP is a key, value pair
        // You index by keys - can be anything you want - string, number, char, float
        Map m = new HashMap();
        
        // Add a value into a map
        m.put("tim",5);
        m.put("joe","x");
        m.put(11,999);

        System.out.println(m);

        // Get value based on key
        System.out.println(m.get("tim"));

        // Remove an element
        m.remove(11);

        // Checks if the given key/value exists in the Map
        // This is handy - because get will 
        System.out.println(m.containsValue("b"));
        System.out.println(m.containsKey(5));
        
        // Prints all values
        System.out.print("Values: ");
        System.out.println(m.values());

        // clear and isEmpty
        m.clear();
        System.out.println(m.isEmpty());
        

        // The above happens in CONSTANT TIME

        // HASHMAP
        // Both map and hashmap must have unique values - adding a duplicate overwrites
        // HashMaps do not guarantee the order we add - see above

        // TREEMAP
        // Guarantees an order
        // Keys MUST be the same type
        Map t = new TreeMap();
        t.put("tim",5);
        t.put("joe","x");

        System.out.println(t);

        // LINKEDHASHMAP
        // Keeps the same order you input the list
        Map l = new LinkedHashMap();




    }
}
