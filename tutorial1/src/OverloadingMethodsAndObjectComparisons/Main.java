package OverloadingMethodsAndObjectComparisons;

public class Main {
    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student bill = new Student("Joe");
        Student tim = new Student("Tim");

        System.out.println(joe == bill);

        // Why isn't joe equal to  bill? To be continued...
    }
}
