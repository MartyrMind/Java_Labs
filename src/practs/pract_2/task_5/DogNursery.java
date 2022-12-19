package practs.pract_2.task_5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogNursery {
    private static ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество собак: ");
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Введите имя и возраст " + (i + 1) + "-ой собаки: ");
            String[] value = in.nextLine().split(" ");
            dogs.add(new Dog(value[0], Integer.parseInt(value[1])));
        }
        System.out.println("Возраст каждой собаки в человеческих годах");
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1 + ": " + dogs.get(i));
        }
    }
}
