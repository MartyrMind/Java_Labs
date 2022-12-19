package practs.pract_6.task_7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class main {

    public static Computer generateComputer(Scanner in) {

        System.out.print("Введите стоимость и частоту обновления монитора: ");
        Monitor monitor = new Monitor(in.nextInt(), in.nextInt());

        System.out.print("Введите стоимость и тактовую частоту процессора:");
        Processor processor = new Processor(in.nextInt(), in.nextInt());

        System.out.print("Введите стоимость и емкость памяти: ");
        Memory memory = new Memory(in.nextInt(), in.nextInt());
        in.nextLine();

        System.out.print("Введите модель компьютера: ");
        String name = in.nextLine();
        for(Models model : Models.values()) {
            if (Objects.equals(name, model.title)) return new Computer(monitor, processor,memory, model);
        }
        return new Computer(monitor, processor, memory, Models.DEFAULT);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        ArrayList<Computer> computers = new ArrayList<Computer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) computers.add(generateComputer(in));

        Shop shop = new Shop(computers);
        System.out.println("Содержимое: ");
        System.out.println(shop);

        System.out.println("Тестирование метода добавления: ");
        shop.add(generateComputer(in));
        System.out.println(shop);

        System.out.println("Тестирование метода поиска и удаления: ");
        System.out.println("Введите имя и цену искомого компьютера: ");
        String name = in.nextLine();
        int cost = in.nextInt();
        shop.del(name, cost);
        System.out.println(shop);

    }
}
