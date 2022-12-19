package practs.pract_19;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class LabClassUI extends JFrame {
    private JTable studentsTable;
    private LabClass labClass;

    public LabClassUI(ArrayList<Comparable> students) {
        super("LabClass");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        labClass = new LabClass(students);

        studentsTable = new JTable(labClass.generateTable());

        JTableHeader tableHeader = studentsTable.getTableHeader();
        tableHeader.setReorderingAllowed(false);
        tableHeader.setResizingAllowed(false);

        JPanel buttonsPanel = new JPanel(new FlowLayout());

        JButton addStudentButton = new JButton("Add student");
        JButton removeStudentButton = new JButton("Remove student");
        JButton findStudentsButton = new JButton("Find student");
        JButton sortStudentsButton = new JButton("Sort students");

        buttonsPanel.add(addStudentButton);
        buttonsPanel.add(removeStudentButton);
        buttonsPanel.add(findStudentsButton);
        buttonsPanel.add(sortStudentsButton);

        addStudentButton.addActionListener(e -> {
            try {
                DefaultTableModel dT = labClass.addStudent();
                studentsTable.setModel(dT);
                JOptionPane.showMessageDialog(null, "Student added");
            } catch (EmptyStringException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        });

        removeStudentButton.addActionListener(e -> {
            try {
                DefaultTableModel dT = labClass.removeStudent();
                studentsTable.setModel(dT);
                JOptionPane.showMessageDialog(null, "Student removed");
            } catch (StudentNotFoundException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            } catch (EmptyStringException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        });

        findStudentsButton.addActionListener(e -> {
            try {
                Student student = (Student) labClass.findStudent();
                JOptionPane.showMessageDialog(null, "Student found: " + student);
            } catch (StudentNotFoundException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        });

        sortStudentsButton.addActionListener(e -> {
            DefaultTableModel dT = labClass.sortStudents();
            studentsTable.setModel(dT);
            JOptionPane.showMessageDialog(null, "Students sorted");
        });

        getContentPane().add(new JScrollPane(studentsTable), BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        setVisible(true);
    }
}
