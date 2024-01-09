package Sets_Lists;
import java.util.Set;
import java.util.HashSet;
// Known from the Java collection list

public class sets_lists {
    public static void main (String[] args) {
    
    // Sets or lists don't require you know the number of elements being added
    // Unlike a Java array
    
    Set<Integer> s = new HashSet<Integer>();

    // Adding to a Set - for now, just assume the -8 was placed arbitrarily 
    s.add(5);
    s.add(7);
    s.add(8);
    s.add(9);
    s.add(5);
    s.add(-8);

    // Check if Set contains
    boolean x = s.contains(9);
    boolean y = s.contains(572);

    // Remove from set
    s.remove(7);

    System.out.println(s);
    System.out.println(x);
    System.out.println(y);

    // Get Set size
    System.out.println(s.size());

    // Clear set completely
    s.clear();

    System.out.println(s);

    // A Set is a collection of unique, unordered elements
    // It's a big bubble you throw things into. It's there, but nowhere specific
    // A HashSet is a standard implementation of a Set

    }
}
