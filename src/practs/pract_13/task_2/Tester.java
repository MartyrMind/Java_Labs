package practs.pract_13.task_2;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Ivanov", "Ivan", "Ivanovich");
        System.out.println(person.getFIO());

        Person person2 = new Person("Ivanov");
        System.out.println(person2.getFIO());
    }
}
