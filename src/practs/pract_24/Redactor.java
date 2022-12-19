package practs.pract_24;

import javax.swing.*;

public class Redactor extends JFrame {
    public Redactor() {
        super("Редактор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenu newFiles = new JMenu("Новый");
        JMenuItem newTextFile = new JMenuItem("Текстовый документ");
        JMenuItem newImageFile = new JMenuItem("Изображение");
        JMenu openFiles = new JMenu("Открыть");
        JMenuItem openTextFile = new JMenuItem("Текстовый документ");
        JMenuItem openImageFile = new JMenuItem("Изображение");
        JMenuItem saveFile = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выход");

        newFiles.add(newTextFile);
        newFiles.add(newImageFile);

        openFiles.add(openTextFile);
        openFiles.add(openImageFile);

        fileMenu.add(newFiles);
        fileMenu.add(openFiles);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        newTextFile.addActionListener(e -> {
           Factory.createDocument(new ICreateTextDocument());
        });

        newImageFile.addActionListener(e -> {
           Factory.createDocument(new ICreateImageDocument());
        });

        openTextFile.addActionListener(e -> {
           Factory.openDocument(new ICreateTextDocument());
        });

        openImageFile.addActionListener(e -> {
              Factory.openDocument(new ICreateImageDocument());
        });

        return fileMenu;
    }

    public static void main(String[] args) {
        new Redactor();
    }
}
