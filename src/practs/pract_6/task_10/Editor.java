package practs.pract_6.task_10;

public class Editor {
    public EventManager events;
    private StringBuilder builder;

    public Editor(StringBuilder builder) {
        this.events = new EventManager("append", "replace", "reverse");
        this.builder = builder;
    }

    public void append(String s) {
        String data = builder.toString();
        builder.append(s);
        events.notify("append", builder, data);
    }

    public void replace(int start, int end, String s) {
        String data = builder.toString();
        builder.replace(start, end, s);
        events.notify("replace", builder, data);
    }

    public void reverse() {
        String data = builder.toString();
        builder.reverse();
        events.notify("reverse", builder, data);
    }
}
