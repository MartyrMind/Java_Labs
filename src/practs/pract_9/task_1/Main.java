package practs.pract_9.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, age and ID number of student " + (i + 1));
            String name = scanner.next();
            int age = scanner.nextInt();
            int iDNumber = scanner.nextInt();
            students[i] = new Student(name, age, iDNumber);
        }

        //insertion sort for students
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(students[j]) < 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
