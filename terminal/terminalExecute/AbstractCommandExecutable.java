package terminal.terminalExecute;

import terminal.CommandResult;

public abstract class AbstractCommandExecutable implements CommandExecutable {

    protected abstract String getDescription();

    protected CommandResult createResult(boolean isSuccess) {
        return new CommandResult(isSuccess, getDescription());
    }
}
