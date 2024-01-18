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

        System.out.println(joe.compareTo(bill));
    }
}
