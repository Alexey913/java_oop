package terminal.command;

public interface CommandParser {
    Command parseCommand(String inputCommand);
}