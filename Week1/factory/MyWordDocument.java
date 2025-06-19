package Week1.factory;

public class MyWordDocument implements WordDocument {
    @Override
    public void open() {
        System.out.println("Opening a Word document...");
    }
}
