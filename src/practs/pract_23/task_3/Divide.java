package practs.pract_23.task_3;

public class Divide extends BinaryOperator implements Expression {

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}

