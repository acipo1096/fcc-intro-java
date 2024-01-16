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

        Dog sean = new Dog("Sean",3);
        Dog youie = new Dog("Youie",3);
        System.out.print("Dog count is ");

        // The reason I'm getting 8 is because, here, Cat inherits Dog, so it's being counted - I guess
        System.out.println(Dog.count);
        // We can change the count
        Dog.count = 5;

        System.out.print("Real Dog count is ");
        System.out.println(Dog.count);

    }
}
