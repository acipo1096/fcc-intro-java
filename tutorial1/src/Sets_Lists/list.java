package Sets_Lists;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        // Basically the same thing as an Array, but
        // It's slower
        // The size is mutable
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);

        // Remove at index
        a.remove(0);

        System.out.println(a);

        // Get index
        a.get(0);
        System.out.println(a.get(0));

        // Set index
        a.set(1,20);

        System.out.println(a);

        // SubList
        // In this case, get elements from index 1 up to but not including 3
        System.out.println(a.subList(1,3));
    }
}
