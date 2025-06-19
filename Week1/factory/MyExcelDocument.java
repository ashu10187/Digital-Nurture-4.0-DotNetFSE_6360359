package Week1.factory;

public class MyExcelDocument implements ExcelDocument {
    @Override
    public void open() {
        System.out.println("Opening an Excel document...");
    }
}
