package practs.pract_2.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.print("Введите количество компьютеров: ");
        int n = in.nextInt();
        int cost;
        String name;
        for(int i = 0; i < n; i++) {
            System.out.println("Введите цену и имя для " + (i + 1) + "-го компьютера: ");
            cost = in.nextInt();
            name = in.nextLine().strip();
            shop.addComputer(new Computer(name, cost));
        }
        System.out.println("Введите имя компьютера, который нужно удалить: ");
        name = in.nextLine();
        System.out.println("Удаленный компьютер: " + shop.findByName(name));
        System.out.println(shop);


    }
}
