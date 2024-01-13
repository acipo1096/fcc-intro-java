package Maps_Examples;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Arrays;

public class MapExamples {
    public static void main(String[] args) {
        
        // Example 1
        Map m = new HashMap();
        String str = "hello my name is alex and i am cool";

        // We can convert a string to a char array with the below method
        for (char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x,old+1);
            }
            else {
                m.put(x,1);
            }
        }
        // Remove all spaces
        m.remove(' ');
        // Counts all the different letters
        System.out.println(m);

        // Example 2
        int[] x = {-99,5,6,3,2,1,7,8,0};

        // Let's SORT this 
        // Below will sort from index 1 up to but not including 7
        Arrays.sort(x, 1, 7);

        // We can't print arrays like this - it will just give us the address in memory
        System.out.println(x);

        for (int i:x) {
            System.out.print(i + ",");
        }
    }
    
}
