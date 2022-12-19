package practs.pract_16;

import practs.pract_15.task_3.MenuBar;

import javax.swing.*;
import java.awt.*;

public class task_3 extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JTextField textField = new JTextField(10);

    task_3() {
        super("MenuBar");
        setSize(300, 300);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        menuBar.add(createTextFontsMenu());
        menuBar.add(createTextColorsMenu());
        setJMenuBar(menuBar);
        add(textField, BorderLayout.CENTER);
        setVisible(true);

    }

    private JMenu createTextFontsMenu() {
        JMenu fonts = new JMenu("Fonts");

        JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
        timesNewRoman.addActionListener(e -> textField.setFont(new Font("Times New Roman", Font.PLAIN, 12)));

        JMenuItem msSansSerif = new JMenuItem("MS Sans Serif");
        msSansSerif.addActionListener(e -> textField.setFont(new Font("MS Sans Serif", Font.PLAIN, 12)));

        JMenuItem courierNew = new JMenuItem("Courier New");
        courierNew.addActionListener(e -> textField.setFont(new Font("Courier New", Font.PLAIN, 12)));

        fonts.add(timesNewRoman);
        fonts.add(msSansSerif);
        fonts.add(courierNew);
        return fonts;
    }

    private JMenu createTextColorsMenu() {
        JMenu colors = new JMenu("Colors");

        JMenuItem red = new JMenuItem("Red");
        red.addActionListener(e -> textField.setForeground(Color.RED));

        JMenuItem black = new JMenuItem("Black");
        black.addActionListener(e -> textField.setForeground(Color.BLACK));

        JMenuItem blue = new JMenuItem("Blue");
        blue.addActionListener(e -> textField.setForeground(Color.BLUE));

        colors.add(red);
        colors.add(black);
        colors.add(blue);
        return colors;
    }

    public static void main(String[] args) {
        new task_3();
    }
}
