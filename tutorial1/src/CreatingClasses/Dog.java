package CreatingClasses;

public class Dog {
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

}
