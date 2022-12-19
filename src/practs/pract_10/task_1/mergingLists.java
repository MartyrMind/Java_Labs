package practs.pract_10.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class mergingLists {

    public static ArrayList<Student> generateList(int n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input format: surname name specialization course group average mark");
        ArrayList<Student> list = new ArrayList<Student>(n);
        for (int i = 0; i < n; i++) {
            String data = in.nextLine();
            String[] dataArr = data.split(" ");
            String surname = dataArr[0];
            String name = dataArr[1];
            String specialization = dataArr[2];
            int course = Integer.parseInt(dataArr[3]);
            int group = Integer.parseInt(dataArr[4]);
            double averageMark = Double.parseDouble(dataArr[5]);
            list.add(new Student(name, surname, specialization, course, group, averageMark));
        }
        return list;
    }

    public static ArrayList<Student> mergeLists(ArrayList<Student> list1, ArrayList<Student> list2) {
        ArrayList<Student> mergedList = new ArrayList<Student>(list1.size() + list2.size());
        Comparator<Student> comparator = new StudentSurnameComparator().thenComparing(new StudentNameComparator());
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        mergedList.sort(comparator);
        return mergedList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students in the first list: ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Student> list1 = generateList(n);
        System.out.print("Enter the number of students in the second list: ");
        n = in.nextInt();
        in.nextLine();
        ArrayList<Student> list2 = generateList(n);
        System.out.println("Merged list:");
        ArrayList<Student> mergedList = mergeLists(list1, list2);
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
