package practs.pract_7.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        MathFunc mathFunc = new MathFunc(); //тестируем использование константы PI
        MathCalculable mathCalculable = mathFunc; //тестируем операции над комплексными числами

        System.out.println("Длина окружности радиусом 5: " + mathFunc.circleLength(5));
        System.out.println("Площадь круга радиусом 5: " + mathFunc.circleArea(5));

        System.out.println("Введите действительную и мнимую части комплексного числа: ");
        int real;
        int imaginary;
        real = in.nextInt();
        imaginary = in.nextInt();

        System.out.println("Модуль числа " + real + " + " + imaginary + "i: " + mathCalculable.abs(new ComplexNumber(real, imaginary)));
        System.out.print("Введите степень, в которую нужно возвести комплексное число: ");
        int n = in.nextInt();
        System.out.println("Число " + real + " + " + imaginary + "i в степени " + n + ": " + mathCalculable.pow(new ComplexNumber(real, imaginary), n));

    }
}
