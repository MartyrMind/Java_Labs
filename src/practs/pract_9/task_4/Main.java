package practs.pract_9.task_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and mark of student " + (i + 1));
            String name = scanner.next();
            double mark = scanner.nextDouble();
            students[i] = new Student(name, mark);
        }

        //sort students by mark
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].myCompareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
