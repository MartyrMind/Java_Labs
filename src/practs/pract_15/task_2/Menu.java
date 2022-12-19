package practs.pract_15.task_2;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Menu extends JFrame {
    String [] items = {"Australia", "China", "England", "Russia"};
    Map<String, String> info = new HashMap<String, String>();
    JComboBox comboBox;

    public Menu() {
        super("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocation(250, 20);
        setLayout(new FlowLayout());

        comboBox = new JComboBox(items);
        add(comboBox);

        info.put("Australia", "Canberra");
        info.put("China", "Beijing");
        info.put("England", "London");
        info.put("Russia", "Moscow");

        comboBox.addActionListener(e -> {
            String country = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(null, "Capital of " + country + " is " + info.get(country));
        });
    }

    public static void main(String[] args) {
        Menu myApp = new Menu();
        myApp.setVisible(true);
    }
}
