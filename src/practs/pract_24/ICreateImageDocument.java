package practs.pract_24;

import javax.swing.*;

public class ICreateImageDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        IDocument document = new ImageDocument("New Image Document");
        JOptionPane.showMessageDialog(null, "Image document created");
        return document;
    }

    @Override
    public IDocument createOpen() {
        IDocument document = new ImageDocument("Opened Image Document");
        JOptionPane.showMessageDialog(null, "Image document opened");
        return document;
    }
}
