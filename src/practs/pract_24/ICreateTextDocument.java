package practs.pract_24;

import javax.swing.*;

public class ICreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        IDocument document = new TextDocument("New Text Document");
        JOptionPane.showMessageDialog(null, "Text document created");
        return document;
    }

    @Override
    public IDocument createOpen() {
        IDocument document = new TextDocument("Opened Text Document");
        JOptionPane.showMessageDialog(null, "Text document opened");
        return document;
    }
}
