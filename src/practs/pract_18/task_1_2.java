package practs.pract_18;

public class task_1_2 {
    public void exceptionDemo() {
        //System.out.println(2.0 / 0.0); -> Infinity
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }

    public static void main(String[] args) {
        task_1_2 test = new task_1_2();
        test.exceptionDemo();
    }
}