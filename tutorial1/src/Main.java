import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // int x = 5;
        // int y = 7;
        // double z = 57;
        // // int sum = x - y * z;

        // // If one variable is a double, the result will be a double
        // double u = z / y;

        // double d = Math.pow(x,y);
        // System.out.println(u);
        // System.out.println(d);

        // // Typecasting - convert int to double as shown below
        // double v = z /(double)y;

        // // Modulus
        // int a = 56 % 5;
        // System.out.println(a);

        // Scanner
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next(); // gets the next stream of input from the Scanner object

        // System.out.println(scanned);

        // Int Scanner
        // int scannedInt = sc.nextInt();

        // System.out.println(scannedInt);

        // Boolean Scanner = nextBoolean();
        // Boolean Double = nextDouble();

        // How to convert?
        int b = Integer.parseInt(scanned);
        System.out.println(b);
    }
}
