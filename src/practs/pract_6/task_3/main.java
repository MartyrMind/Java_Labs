package practs.pract_6.task_3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Nameable entity = new Planet("Earth");
        for(int i = 0; i < 4; i++) {
           int randomNum = ThreadLocalRandom.current().nextInt(-1, 2 + 1);
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            switch (randomNum){
                case 0:
                    entity = new Planet(name);
                    break;
                case 1:
                    entity = new Car(name);
                    break;
                case 2:
                    entity = new Cat(name);
                    break;
            }
            System.out.println("Был создан объект " + entity.getClass());
            System.out.println("Его имя: " + entity.getName());
        }
    }
}
