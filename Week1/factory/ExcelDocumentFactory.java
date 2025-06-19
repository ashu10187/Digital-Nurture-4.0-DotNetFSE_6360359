package Week1.factory;

public class ExcelDocumentFactory extends DocumentFactory<ExcelDocument> {
    @Override
    public ExcelDocument createDocument() {
        return new MyExcelDocument();
    }
}
