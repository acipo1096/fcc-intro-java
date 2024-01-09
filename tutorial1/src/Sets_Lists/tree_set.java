package Sets_Lists;
import java.util.Set;
import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        // A TreeSet is like a HashSet, but
        // You can only have unique elements
        // It is an ordered data structure

        Set<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);

        System.out.print("TreeSet: ");
        System.out.println(t);

        // As you can see, duplicate values are removed, and there is an order
    }


}
