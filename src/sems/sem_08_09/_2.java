package sems.sem_08_09;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class _2 {
    /*
        генирирует целочисленный массив элемент от 0 до 100, количество с консоли
        вывод: массив, количество элементов
        ввод: число
        число удаляется из массива
        вывод всего массива без этих чисел
        ввод: число от 0 до 9
        удаляет все элементы, оканчивающиеся на эти числа
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            list.add(random.nextInt(0, 101));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Integer t = in.nextInt();
        while(list.remove(t)) {
            list.remove(t);
        }
        System.out.println(list.size());
        for(Integer s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        int del = in.nextInt();
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 10 == del) list.remove(i);
            else {
                System.out.print(list.get(i) + " ");
                i++;
            }
        }
        //System.out.println(list.size());
    }
}
