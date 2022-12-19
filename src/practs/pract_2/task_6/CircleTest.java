package practs.pract_2.task_6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Координаты центра окружности: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print("Радиус окружности: ");
        double radius = in.nextDouble();
        Circle circle = new Circle(x, y, radius);
        Circle circleModel = new Circle(0, 0, 1);
        System.out.println(
                "Длина окружности: " + circle.Length() +
                "\nПлощадь: " + circle.Area());
        System.out.println("Сравним две окружности:\n\t"
                + circle + "\n\t" + circleModel);
        System.out.println("Результат: " + circle.equals(circleModel));
    }
}
