package practs.pract_16;

import javax.swing.*;
import java.awt.*;

public class task_2 extends JFrame {
    JLabel north = new JLabel("North", JLabel.CENTER);
    JLabel south = new JLabel("South", JLabel.CENTER);
    JLabel east = new JLabel("East", JLabel.CENTER);
    JLabel west = new JLabel("West", JLabel.CENTER);
    JLabel center = new JLabel("Center", JLabel.CENTER);

    public task_2() {
        super("task_2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        this.setLocationRelativeTo(null);
        Container container = getContentPane();

        north.setBackground(Color.cyan);
        south.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.green);
        west.setBackground(Color.yellow);
        center.setBackground(Color.red);

        north.setOpaque(true);
        south.setOpaque(true);
        east.setOpaque(true);
        west.setOpaque(true);
        center.setOpaque(true);

        container.add(north, BorderLayout.NORTH);
        container.add(south, BorderLayout.SOUTH);
        container.add(east, BorderLayout.EAST);
        container.add(west, BorderLayout.WEST);
        container.add(center);

        north.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });

        south.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
            }
        });

        east.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });

        west.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });

        center.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new task_2();
    }
}
