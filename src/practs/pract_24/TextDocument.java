package practs.pract_24;

import javax.swing.*;

public class TextDocument extends IDocument {
    private String name;

    public TextDocument(String name) {
        this.name = name;
        JOptionPane.showMessageDialog(null, "Text document created");
    }

    @Override
    String getDocumentName() {
        return name;
    }
}

