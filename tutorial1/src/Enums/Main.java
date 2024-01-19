package Enums;

public class Main {
    public static void main(String[] args) {
        // Enums are a collection of constants that we can reference
        // Level lvl = Level.LOW;
        // Level[] arr = Level.values();
        // String en = lvl.toString();

        // System.out.println(Level.values()); // Shows memory location

        // for (Level e : arr) {
        //     System.out.println(e);
        // }

        // // Check value of constant
        // if (lvl == Level.LOW) {
        //     System.out.println(lvl);
        // } 
        // else if (lvl == Level.MEDIUM) {
        //     System.out.println(lvl);
        // } 
        // else {
        //     System.out.println(lvl);
        // }

        // Hash Table-esque Implementation
        Level lvl = Level.LOW;
        System.out.println(lvl.getLvl());
    }
}
