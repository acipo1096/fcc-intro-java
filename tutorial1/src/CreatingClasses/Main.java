package CreatingClasses;

public class Main {
    public static void main(String[] args) {
        Dog alex = new Dog("Alex",4);
        alex.speak();
        Dog baxter = new Dog("Baxter",7);
        baxter.speak();
        Dog charlie = new Dog("Charlie",11);
        charlie.speak();

        // Can call this twice since it retains its props
        alex.speak();

        alex.setAge(10);
        alex.speak();

        // "The method add2() from the type Dog is not visible"
        // alex.add2();

        // Proof that Cat works
        Cat tigger = new Cat("Tigger", 7, 100);
        tigger.speak();

        Cat bob = new Cat("Bob", 7);
        Cat joe = new Cat("Joe");

        bob.speak();
        joe.speak();
    }
}
