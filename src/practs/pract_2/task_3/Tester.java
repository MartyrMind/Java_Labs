package practs.pract_2.task_3;

import java.util.List;
import java.util.Scanner;

public class Tester {
    private static int n;
    private static Circle[] circles;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество кругов: ");
        n = in.nextInt();
        circles = new Circle[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Координаты центра и радиус " + (i + 1) + "-го круга: ");
            circles[i] = new Circle(new Point(in.nextDouble(), in.nextDouble()), in.nextDouble());
        }

        System.out.println("Были созданы следующие круги:");
        for(int i = 0; i < n; i++) System.out.println(circles[i]);
    }
}
