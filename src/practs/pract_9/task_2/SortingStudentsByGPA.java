package practs.pract_9.task_2;

import java.util.Scanner;

//quick sort for students
public class SortingStudentsByGPA {
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

        quickSort(students, 0, students.length - 1);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void quickSort(Student[] students, int low, int high) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student mid = students[middle];

        int i = low, j = high;
        while (i <= j) {
            while (students[i].compareTo(mid) < 0) {
                i++;
            }

            while (students[j].compareTo(mid) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }
}

