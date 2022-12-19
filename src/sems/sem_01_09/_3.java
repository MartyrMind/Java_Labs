package sems.sem_01_09;

import java.util.Arrays;
import java.util.Random;

public class _3 {
    //нужно сгенирировать массив целых чисел, вывести
    //отсоритровать
    //10 символов
    //вывести
    //2 разных подхода
    //random и math.random
    public static void main(String[] args) {
        var randArray = new int[10];
        var mathRandArray = new int[10];
        Random random = new Random();
        System.out.println("random array");
        for(int i = 0; i < 10; i++) {
            randArray[i] = random.nextInt() % 10;
            System.out.print(randArray[i] + " ");
            mathRandArray[i] = (int) (Math.random() * 10);
        }
        System.out.println();
        Arrays.sort(randArray);
        for(int i = 0; i < 10; i++) {
            System.out.print(randArray[i] + " ");
        }
        System.out.println();
        System.out.println("math random array");
        for(int i = 0; i < 10; i++) {
            System.out.print(mathRandArray[i] + " ");
        }
        System.out.println();
        Arrays.sort(mathRandArray);
        for(int i = 0; i < 10; i++) {
            System.out.print(mathRandArray[i] + " ");
        }

    }


}
