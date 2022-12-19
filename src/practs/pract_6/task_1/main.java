package practs.pract_6.task_1;

import java.util.Scanner;

public class main {

    public static void move(Movable movable) {
        System.out.println("Объект движется: ");
        movable.moveDown();
        System.out.println("Вниз: " + movable);
        movable.moveRight();
        System.out.println("Направо: " + movable);
        movable.moveUp();
        System.out.println("Вверх: " + movable);
        movable.moveLeft();
        System.out.println("Налево: " + movable);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты точки: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("Введите ее скорость по осям x и y: ");
        Movable point = new MovablePoint(x, y, in.nextInt(), in.nextInt());
        System.out.println("----------------------------------------------");
        System.out.println("Созданная точка: " + point);
        System.out.println("Подвигаем ее:");
        System.out.println("----------------------------------------------");
        move(point);
        System.out.println("----------------------------------------------");

        System.out.print("Введите координаты центра окружности: ");
        x = in.nextInt();
        y = in.nextInt();
        System.out.print("Введите его скорость по осям x и y: ");
        MovablePoint center = new MovablePoint(x, y, in.nextInt(), in.nextInt());
        System.out.print("Введите радиус окружности: ");
        Movable circle = new MovableCircle(in.nextInt(), center);
        System.out.println("----------------------------------------------");
        System.out.println("Созданная окружность: " + circle);
        System.out.println("Подвигаем ее:");
        System.out.println("----------------------------------------------");
        move(circle);

    }
}
