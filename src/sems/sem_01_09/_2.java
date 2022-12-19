package sems.sem_01_09;

public class _2 {
    public static void main(String[] args) {
        int n = 10;
        //вывести первые 10 членов гарм ряда
        float sum = 0.0f;
        for (int i = 1; i <= n; i++) {
            float memb = 1.0f / i;
            String num = String.format("%.3f", memb);
            System.out.println(num);
            sum += memb;
        }
        System.out.printf("%.3f%n", sum);
    }
}
