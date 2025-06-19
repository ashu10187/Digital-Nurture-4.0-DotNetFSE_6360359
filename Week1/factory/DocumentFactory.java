package Week1.factory;

public abstract class DocumentFactory<T> {
    public abstract T createDocument();
}