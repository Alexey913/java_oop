package terminal.command;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser {

    @Override
    public Command parseCommand(String inputCommand) {
        List<String> actions = new ArrayList<>();
        String[] commands = inputCommand.split(" ");
        try {
            for (int i = 1; i < commands.length; i++) {
                actions.add(commands[i]);
            }
            return new Command(commands[0], actions);
        } catch (ArrayIndexOutOfBoundsException e) {
            return new Command(commands[0], actions);
        }
    }
}
