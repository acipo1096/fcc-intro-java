package whileLoop;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // for loops are good when you know how many times you need to loop through something
        // while loops are better for when you don't know
        Scanner sc = new Scanner(System.in);
        int x;

        // while (x != 10) {
        //     System.out.println("Type 10...");
        //     System.out.print("Type a number: ");
        //     x = sc.nextInt();
        // }

        // do while loops
        do {
            System.out.print("Type a number: ");
            x  = sc.nextInt();
        } while (x != 10);
    }
}
