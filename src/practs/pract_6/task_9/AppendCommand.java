package practs.pract_6.task_9;

import java.util.ArrayList;
import java.util.Objects;

public class AppendCommand extends Command{
    public AppendCommand(StringBuilder builder) {
        super(builder);
    }

    @Override
    public String execute(ArrayList<Object> args) {
        builder.append((String) args.get(0));
        backups.add(builder.toString());
        return builder.toString();
    }
}
