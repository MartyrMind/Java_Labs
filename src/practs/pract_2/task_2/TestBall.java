package practs.pract_2.task_2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ball fake_ball = new Ball(); //конструктор по умолчанию

        System.out.print("Введите координаты в формате 'x,x y,y': ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Ball ball = new Ball(x, y); //конструктор с параметрами
        //toString
        System.out.println("Мяч-модель: " + fake_ball);
        System.out.println("Настоящий мяч: " + ball);

        //move и геттеры
        System.out.print("Сдвиги по оси x и y: ");
        double xDisp = in.nextDouble();
        double yDisp = in.nextDouble();
        ball.move(xDisp, yDisp);
        System.out.println("Новые координаты мяча: " +
                "\n\tОсь x: " + ball.getX() +
                "\n\tОсь y: " + ball.getY());

        //сеттеры
        System.out.print("Координаты мяча-модели по оси x: ");
        fake_ball.setX(in.nextDouble());
        System.out.println(fake_ball);
        System.out.print("Координаты мяча-модели по оси y: ");
        fake_ball.setY(in.nextDouble());
        System.out.println(fake_ball);
        System.out.print("Координаты мяча-модели по оси x и y: ");
        fake_ball.setXY(in.nextDouble(), in.nextDouble());
        System.out.println(fake_ball);
    }
}
