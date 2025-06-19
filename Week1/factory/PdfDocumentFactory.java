package Week1.factory;

public class PdfDocumentFactory extends DocumentFactory<PdfDocument> {
    @Override
    public PdfDocument createDocument() {
        return new MyPdfDocument();
    }
}
