package Week1.factory;

public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Word document test
        DocumentFactory<WordDocument> wordFactory = new WordDocumentFactory();
        WordDocument wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // PDF document test
        DocumentFactory<PdfDocument> pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Excel document test
        DocumentFactory<ExcelDocument> excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
