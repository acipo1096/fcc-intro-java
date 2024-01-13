package CreatingClasses;

// Extends allows for the INHERITANCE of Dog
// Grabs everything from Dog
// Cat is now the subclass, or Child class

public class Cat extends Dog {

    private int food;
    // We can add other attributes to the super class/constructor
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    // We can create multiple constructors
    // We give the program another way to call the Cat class
    // Now, we can call Cat with 2 parameters or 3 - or 1

    public Cat(String name, int age) {
        super(name, age);
        // Sets food to default param
        this.food = 50;
    }

    public Cat(String name) {
        // We need an age parameter
        // Workaround for this instance: if no age given, assume age = 0
        super(name,0);
    }

    // If we want to change a method in the Parent class, simply rewrite it, and it overrides the Parent
    public void speak() {
        System.out.println("Meow! My name is " + this.name + " and I get fed " + this.food);
    }

    // What we do in Cat is NOT visible in Dog. This is one way only.
    public void eat(int x) {
        this.food -= x;
    }

}