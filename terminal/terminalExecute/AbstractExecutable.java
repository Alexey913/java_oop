package terminal.terminalExecute;

import terminal.command.show.CommandStatus;

public abstract class AbstractExecutable implements CommandExecutable {

    protected abstract String getComment();

    protected CommandStatus createResult(boolean isDone) {
        return new CommandStatus(isDone, getComment());
    }
}