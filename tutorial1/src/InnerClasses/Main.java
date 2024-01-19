package InnerClasses;

public class Main {
    public static void main(String[] args) {
        // We need this regardless if InnerClass is public or private
        OuterClass out = new OuterClass();
        
        // New instance of InnerClass when it's public
        // out comes first because we're creating an inner instance of out

        // OuterClass.InnerClass in = out.new InnerClass();
        // out.inner();
        // in.display();

        // The Third Way
        out.inner();
    }
    
}
