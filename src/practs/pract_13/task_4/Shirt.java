package practs.pract_13.task_4;

public class Shirt {
    private String ID;
    private String model;
    private String color;
    private String size;

    public Shirt(String data) {
        String[] dataArr = data.split(",");
        this.ID = dataArr[0];
        this.model = dataArr[1];
        this.color = dataArr[2];
        this.size = dataArr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "ID='" + ID + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
