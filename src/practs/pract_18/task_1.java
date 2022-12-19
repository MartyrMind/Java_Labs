package practs.pract_18;

public class task_1 {
    public void exceptionDemo() {
        //System.out.println(2.0 / 0.0); -> Infinity
        System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        task_1 test = new task_1();
        test.exceptionDemo();
    }
}




