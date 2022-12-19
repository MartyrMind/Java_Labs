package practs.pract_6.task_3;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
