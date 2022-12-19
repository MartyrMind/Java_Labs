package practs.pract_9.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Stream.concat;

public class ConcatLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students in the first list:");
        int n = scanner.nextInt();
        ArrayList<Student> students1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, and age of student " + (i + 1));
            String name = scanner.next();
            int age = scanner.nextInt();
            students1.add(new Student(name, age));
        }

        System.out.println("Enter the number of students in the second list:");
        n = scanner.nextInt();
        ArrayList<Student> students2 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, and age of student " + (i + 1));
            String name = scanner.next();
            int age = scanner.nextInt();
            students2.add(new Student(name, age));
        }

        students1.addAll(students2);
        //sort students by age
        students1.sort(Student::compareTo);
        for (Student student : students1) {
            System.out.println(student);
        }
    }
}
