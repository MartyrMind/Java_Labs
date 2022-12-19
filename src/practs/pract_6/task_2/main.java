package practs.pract_6.task_2;

import java.util.Scanner;

public class main {
    public static MovablePoint getPoint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты точки: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("Введите ее скорость по осям x и y: ");
        MovablePoint point = new MovablePoint(x, y, in.nextInt(), in.nextInt());
        System.out.println("----------------------------------------------");
        return point;
    }

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
        Movable rect = new MovableRectangle(getPoint(), getPoint());
        System.out.println("Созданный прямоугольник: " + rect);
        move(rect);
    }
}
