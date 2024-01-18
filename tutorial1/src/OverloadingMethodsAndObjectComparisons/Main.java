package OverloadingMethodsAndObjectComparisons;

public class Main {
    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        Student tim = new Student("Tim");

        // System.out.println(joe == bill);

        // Why isn't joe equal to  bill?
        // Because these are 2 separate OBJECTS, 2 separate places in RAM
        // Even though they're named the same, they are considered completely unique

        // Using the new boolean method
        // System.out.println(joe.equals(bill));

        // We get 8 because that's the distance
        System.out.println(joe.compareTo(bill));

        System.out.println(joe.compareTo(tim));

        // How do we print out a string representation rather than the location in memory?
        System.out.println(tim.toString());
        // In the above case, we actually don't need to call toString(). Java knows

    }
}
