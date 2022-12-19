package practs.pract_23.task_3;

public class Const implements Expression {

    private double value;
    public Const(double val) {
        value = val;
    }

    @Override
    public double evaluate(double x) {
        return value;
    }
}
