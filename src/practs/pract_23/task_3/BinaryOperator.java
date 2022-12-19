package practs.pract_23.task_3;

public abstract class BinaryOperator implements  Expression{

    protected Expression left;
    protected Expression right;

    abstract public double evaluate(double x);
}
