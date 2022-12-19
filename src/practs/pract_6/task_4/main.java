package practs.pract_6.task_4;

import practs.pract_6.task_3.Cat;
import practs.pract_6.task_3.Nameable;
import practs.pract_6.task_3.Planet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Priceable entity = new Computer(0);
        for(int i = 0; i < 4; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-1, 2 + 1);
            System.out.print("Введите цену: ");
            int price = in.nextInt();
            switch (randomNum){
                case 0:
                    entity = new Computer(price);
                    break;
                case 1:
                    entity = new Car(price);
                    break;
                case 2:
                    entity = new Tablet(price);
                    break;
            }
            System.out.println("Был создан объект " + entity.getClass());
            System.out.println("Его цена: " + entity.getPrice());
        }
    }
}
