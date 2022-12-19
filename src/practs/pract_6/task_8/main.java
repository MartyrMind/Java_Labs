package practs.pract_6.task_8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Тестирование перевода в Цельсии: ");
        Convertable celcius = new Celcius(0);
        System.out.print("Введите температуру в Кельвинах: ");
        celcius.convert(new Kelvin(in.nextDouble()));
        System.out.println("Из Кельвинов в Цельсии: ");
        System.out.println(((Celcius) celcius).getTemperature());
        System.out.print("Введите температуру в Фаренгейтах: ");
        celcius.convert(new Fahrenheit(in.nextDouble()));
        System.out.println("Из Фаренгейтов в Цельсии: ");
        System.out.println(((Celcius) celcius).getTemperature());


        System.out.println("Тестирование перевода в Кельвины: ");
        Convertable kelvin = new Kelvin(0);
        System.out.print("Введите температуру в Цельсиях: ");
        kelvin.convert(new Celcius(in.nextDouble()));
        System.out.println("Из Цельсия в Кельвины: ");
        System.out.println(((Kelvin) kelvin).getTemperature());
        System.out.print("Введите температуру в Фаренгейтах: ");
        kelvin.convert(new Fahrenheit(in.nextDouble()));
        System.out.println("Из Фаренгейтов в Кельвины: ");
        System.out.println(((Kelvin) kelvin).getTemperature());

        System.out.println("Тестирование перевода в Фаренгейты: ");
        Convertable fahrenheit = new Fahrenheit(0);
        System.out.print("Введите температуру в Цельсиях: ");
        fahrenheit.convert(new Celcius(in.nextDouble()));
        System.out.println("Из Цельсия в Фаренгейты: ");
        System.out.println(((Kelvin) kelvin).getTemperature());
        System.out.print("Введите температуру в Кельвинах: ");
        fahrenheit.convert(new Kelvin(in.nextDouble()));
        System.out.println("Из Кельвинов в Фаренгейты: ");
        System.out.println(((Kelvin) kelvin).getTemperature());


    }
}
