package practs.pract_6.task_3;

public class Planet implements Nameable{
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
