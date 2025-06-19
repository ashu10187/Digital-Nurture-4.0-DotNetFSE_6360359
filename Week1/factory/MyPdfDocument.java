package Week1.factory;

public class MyPdfDocument implements PdfDocument {
    @Override
    public void open() {
        System.out.println("Opening a PDF document...");
    }
}
