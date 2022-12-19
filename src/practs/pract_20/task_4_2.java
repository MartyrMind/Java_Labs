package practs.pract_20;

public class task_4_2 {
    public static <V extends Number, E extends Number> Number sum(V a, E b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <V extends Number, E extends Number> Number subtraction(V a, E b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <V extends Number, E extends Number> Number multiply(V a, E b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <V extends Number, E extends Number> Number divide(V a, E b) {
        //из-за использования doubleValue не надо проверять деление на 0
        //результат будет +- бесконечность
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {

        long a = 5;
        int b = 3;
        double c = 2.5;
        float d = 1.5f;
        System.out.println(sum(a, c));
        System.out.println(subtraction(c, b));
        System.out.println(multiply(d, a));
        System.out.println(divide(a, 0));
        System.out.println(divide(c, a));
    }
}
