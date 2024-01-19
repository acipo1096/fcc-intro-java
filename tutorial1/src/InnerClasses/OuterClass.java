package InnerClasses;

public class OuterClass {
    // private class InnerClass {
    //     // This class is contained within the OuterClass
    //     // In other words, we can only access it within OuterClass
    //     public void display() {
    //         System.out.println("This is an inner class");
    //     }
    // }

    // What if we make this public?
    // public class InnerClass {
    //     // This class is contained within the OuterClass
    //     // In other words, we can only access it within OuterClass
    //     public void display() {
    //         System.out.println("This is an inner class");
    //     }
    // }

    // A Third Way
    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("Inner class");
            }
        }
        InnerClass in = new InnerClass();
        in.display();

    }

}
