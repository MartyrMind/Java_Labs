package practs.pract_7.task_2;

public class ComplexNumber {
    private double x;
    private double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ComplexNumber: " + x + " " + y + "i";
    }
}
