package Week1.factory;

public class WordDocumentFactory extends DocumentFactory<WordDocument> {
    @Override
    public WordDocument createDocument() {
        return new MyWordDocument();
    }
}