package practs.pract_6.task_10;

public class AppendListener implements EventListener {

    @Override
    public void update(String eventType, StringBuilder op, String data) {
        System.out.println("Строка " + data + " была изменена");
        System.out.println("Тип операции: " + eventType);
        System.out.println("Результат: " + op.toString());
        System.out.println();
    }
}
