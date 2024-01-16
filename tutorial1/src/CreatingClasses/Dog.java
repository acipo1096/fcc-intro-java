package CreatingClasses;

public class Dog {

    protected static int count = 0;
    // STATIC allows us to change ALL instances of the given value

    // A class is a data type
    // An instance of a class is a blueprint
    // When we create an instance, we use all the information to create an Object

    // PROTECTED VALUES
    // Ensure that only things within the same package, or are subclasses of the class, can access the variable
    protected String name;
    
    // Private ensures that the below attributes are only accessible in THIS class
    private int age;
    
    // CONSTRUCTOR
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        // Since we're within the class, no need for the "something." beforehand
        // add2();
        // speak();

        // THIS IS THE KEYWORD THAT REFERENCES THE ATTRIBUTES OF THE SPECIFIC INSTANCE OF A CLASS
        // References the private variables
        // If I change the name of a private variable, an error is thrown, so they ARE connected

        // Static variable
        // Since this is a static variable, it doesn't care what instance it's being used on
        // this.count works, too, but the below is better
        Dog.count += 1;
        Dog.display();

        // Uncommenting this will give me an error
        // "Cannot make a static reference to the non-static method display2() from the type Dog"
        // Dog.display2();
    }


    public void speak() {
        System.out.println("I am " + this.name + ", and I am " + this.age + " years old.");
    }

    public int getAge() {
        // We need this, because of the private status
        // Only in this class can we reference this variable
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // This method can only be used and seen within the Dog class
    private int add2() {
        return this.age + 2;
    }



    // STATIC METHOD
    // You do not need an instance to call this
    // We use this when we don't care about the instance. Think of it like a function
    // You just want to do something - attributes aren't important
    
    public static void display() {
        System.out.println("I am a dog!");
    }

    public void display2() {
        System.out.println("I am a dog!");
    }

}
