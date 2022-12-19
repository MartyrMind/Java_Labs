package practs.pract_24;

import javax.swing.*;

public class ImageDocument extends IDocument {
    private String name;

    public ImageDocument(String name) {
        this.name = name;
        JOptionPane.showMessageDialog(null, "Image document created");
    }

    @Override
    String getDocumentName() {
        return name;
    }
}

