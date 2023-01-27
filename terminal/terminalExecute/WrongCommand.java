package terminal.terminalExecute;

import terminal.command.show.CommandStatus;

public class WrongCommand extends AbstractExecutable {
    private static final String COMMENT = "НЕВЕРНАЯ КОМАНДА!";

    @Override
    public CommandStatus execute() {
        return new CommandStatus(getComment());
    }

    @Override
    protected String getComment() {
        return COMMENT;
    }
}