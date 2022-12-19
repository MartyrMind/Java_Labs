package practs.pract_6.task_9;

import java.util.ArrayList;
import java.util.Objects;

public class ReplaceCommand extends Command{
    public ReplaceCommand(StringBuilder builder) {
        super(builder);
    }

    @Override
    public String execute(ArrayList<Object> args) {
        builder.replace((int)args.get(0), (int) args.get(1), (String) args.get(2));
        backups.add(builder.toString());
        return builder.toString();
    }
}
