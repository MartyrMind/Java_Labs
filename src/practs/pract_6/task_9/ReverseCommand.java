package practs.pract_6.task_9;

import java.util.ArrayList;

public class ReverseCommand extends Command{
    public ReverseCommand(StringBuilder builder) {
        super(builder);
    }

    @Override
    public String execute(ArrayList<Object> args) {
        builder.reverse();
        backups.add(builder.toString());
        return builder.toString();
    }
}
