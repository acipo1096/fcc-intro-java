package InnerClasses;

public class OuterClass {
    private class InnerClass {
        // This class is contained within the OuterClass
        // In other words, we can only access it within OuterClass
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }


}
