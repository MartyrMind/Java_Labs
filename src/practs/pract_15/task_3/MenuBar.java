package practs.pract_15.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame {
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JTextField textField = new JTextField(10);
    JPanel panel = new JPanel();
    JMenuBar menuBar = new JMenuBar();

    MenuBar() {
        super("MenuBar");
        setSize(750, 550);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        setJMenuBar(menuBar);
        panel.setSize(250, 150);
        panel.add(button1);
        panel.add(button2);
        add(panel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        return fileMenu;
    }
    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        return editMenu;
    }

    public static void main(String[] args) {
        new MenuBar();
    }
}
