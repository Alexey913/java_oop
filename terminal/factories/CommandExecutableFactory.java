package terminal.factories;

import terminal.command.Command;
import terminal.terminalExecute.CommandExecutable;

public interface CommandExecutableFactory {
    public CommandExecutable commandForAction (Command input);
}