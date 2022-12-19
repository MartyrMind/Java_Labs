package practs.pract_19;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class LabClass {
    private ArrayList<Comparable> students;
    private DefaultTableModel tableModel;
    public LabClass(ArrayList<Comparable> students) {
        this.students = students;
    }

    public DefaultTableModel addStudent() throws EmptyStringException {
        String fio = JOptionPane.showInputDialog("Enter student's name");
        if (fio == null || fio.equals("")) throw new EmptyStringException("Empty string");
        String mark = JOptionPane.showInputDialog("Enter student's mark");
        double markDouble = Double.parseDouble(mark);

        students.add(new Student(fio, markDouble));
        tableModel.addRow(new Object[]{fio, markDouble});
        return tableModel;
    }

    public DefaultTableModel removeStudent() throws StudentNotFoundException {
        String fio = JOptionPane.showInputDialog("Enter student's name");
        if (fio == null || fio.equals("")) throw new EmptyStringException("Empty string");
        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i);
            if (s.getName().equals(fio)) {
                students.remove(i);
                return generateTable();
            }
        }
        throw new StudentNotFoundException("Student not found", new IllegalArgumentException());
    }

    public Comparable findStudent() throws StudentNotFoundException {
        String fio = JOptionPane.showInputDialog("Enter student's name");
        if (fio == null || fio.equals("")) throw new EmptyStringException("Empty string");
        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i);
            if (s.getName().equals(fio)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found", new IllegalArgumentException());
    }

    public DefaultTableModel sortStudents() {
        students.sort(Comparable::compareTo);
        return generateTable();
    }
    public DefaultTableModel generateTable() {
        Object[] header = new String[]{"Name", "Mark"};
        Object[][] data = new Object[students.size()][2];

        for (int i = 0; i < students.size(); i++) {
            Student student = (Student) students.get(i);
            data[i][0] = student.getName();
            data[i][1] = String.valueOf(student.getAverageMark());
        }
        tableModel = new DefaultTableModel(data, header);
        return tableModel;
    }
}
