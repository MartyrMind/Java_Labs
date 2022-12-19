package practs.pract_24;

public abstract class IDocument {
    abstract String getDocumentName();

    public String toString() {
        return getDocumentName();
    }
}
