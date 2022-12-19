package practs.pract_7.task_3;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new ProcessString();
        System.out.println(processor.cntLiter("Hello"));
        System.out.println(processor.substring("Hello"));
        System.out.println(processor.reverse("Hello"));
    }
}
