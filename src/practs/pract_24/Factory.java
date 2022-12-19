package practs.pract_24;

public class Factory {
    public static IDocument createDocument(ICreateDocument creator) {
        return creator.createNew();
    }

    public static IDocument openDocument(ICreateDocument creator) {
        return creator.createOpen();
    }
}
