package practs.pract_23.task_3;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}

