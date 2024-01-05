package loops;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // Looping through array - special syntax

        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int element:arr) {
            // Every time we loop through this, we declare a new variable called element
            // element will be equal to the next element in our array
            // System.out.println(element + " " + count);
            count++;
        }

        // Populate array with for loop
        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String n:names) {
            System.out.println(n);
            if (n.equals("Tim")) {
                break;
            }
        }
    }

}
