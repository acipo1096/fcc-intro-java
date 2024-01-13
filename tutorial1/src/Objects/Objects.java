package Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Objects {
    public static void main(String[] args) {
        // An OBJECT is an instance of a certain data type
        Scanner sc = new Scanner(System.in);
        int x = 5;
        String h = "hello";
        h.length();

        alexander();
        alex("Cipollone", 27);
        System.out.println();
        System.out.println(add2(6));
        
        System.out.println();
        System.out.println(str("Alexandah!"));

    }
    
    // METHODS are anything you call on an object or an instance of an object
    // An INSTANCE is similar to an object
    
    // Creating our OWN method
    public static void alexander() {
        System.out.println("Alexandah!");
    }

    // With a parameter
    public static void alex(String lastName, int age) {
        System.out.print("Alexander ");
        System.out.print(lastName);
        System.out.print(", Age: ");
        System.out.print(age);
    }

    // Methods with a return
    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }

    // Remember: the method is created outside of the main method
    // But we call our method in the main method

}

