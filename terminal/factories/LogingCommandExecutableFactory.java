package terminal.factories;

import service.StudentServiceImpl;
import terminal.command.Command;
import terminal.terminalExecute.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(StudentServiceImpl studentServiceImpl) {
        super(studentServiceImpl);
    }

    @Override
    public CommandExecutable commandForAction(Command input) {
        System.out.println("Information about input data");
        CommandExecutable commandExecutable = super.commandForAction(input);
        System.out.println("Information about output data");
        return commandExecutable;
    }
}