package practs.pract_10.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Tester {

    ArrayList<Student> iDNumber;

    void fillArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        in.nextLine();
        iDNumber = new ArrayList<Student>(n);
        System.out.println("Input format: surname name specialization course group average mark");
        for (int i = 0; i < n; i++) {
            String data = in.nextLine();
            String[] dataArr = data.split(" ");
            String surname = dataArr[0];
            String name = dataArr[1];
            String specialization = dataArr[2];
            int course = Integer.parseInt(dataArr[3]);
            int group = Integer.parseInt(dataArr[4]);
            double averageMark = Double.parseDouble(dataArr[5]);
            iDNumber.add(new Student(name, surname, specialization, course, group, averageMark));
        }
    }

    void quicksort() {
        Comparator<Student> comparator = new StudentAverageMarkComparator();
        iDNumber.sort(comparator);
    }

    void alphabetSort() {
        Comparator<Student> comparator = new StudentSurnameComparator().thenComparing(new StudentNameComparator());
        iDNumber.sort(comparator);
    }

    void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println("Fill the array:");
        tester.fillArray();
        System.out.println("--------------------");
        System.out.println("Sorted by average mark:");
        tester.quicksort();
        tester.outArray();
        System.out.println("--------------------");
        System.out.println("Sorted by surname and name:");
        tester.alphabetSort();
        tester.outArray();
    }
}
