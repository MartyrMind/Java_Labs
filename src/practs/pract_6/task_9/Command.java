package practs.pract_6.task_9;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Command {
    public StringBuilder builder;
    ArrayList<String> backups;

    public Command(StringBuilder builder) {
        this.builder = builder;
        backups = new ArrayList<String>();
        backups.add(this.builder.toString());
    }

    public void setBuilder(StringBuilder builder) {
        this.builder = builder;
    }

    public String undo() {
        builder = new StringBuilder(backups.get(backups.size() - 2));
        backups.remove(backups.size() - 1);
        return builder.toString();
    }
    public abstract String execute(ArrayList<Object> args);
}
