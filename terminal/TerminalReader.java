package terminal;

import java.util.Scanner;

import terminal.command.Command;
import terminal.command.CommandParser;
import terminal.command.show.CommandStatus;
import terminal.command.show.ShowResult;
import terminal.factories.CommandExecutableFactory;
import terminal.terminalExecute.CommandExecutable;

public class TerminalReader {

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    private final ShowResult resultView;

    private static TerminalReader terminalReader;

    private TerminalReader(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory, ShowResult resultView) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.resultView = resultView;
    }

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory, ShowResult resultView) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, resultView);
        }
        return terminalReader;
    }

    public void scanner() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            Command parseCommand = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.commandForAction(parseCommand);
            CommandStatus result = commandExecutable.execute();
            resultView.showCommandStatus(result);
        }
    }
}