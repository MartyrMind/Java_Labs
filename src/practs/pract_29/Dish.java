package practs.pract_29;

public final class Dish implements Item {
    private String name;
    private String description;
    private double cost;

    public Dish(String name, String description, double cost) throws IllegalArgumentException {
        this.name = name;
        this.description = description;
        if (cost < 0 || name.equals("") || description.equals("")) throw new IllegalArgumentException("Illegal argument");
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }
}
