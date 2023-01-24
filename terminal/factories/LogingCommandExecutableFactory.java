// Задание 2
// - Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactory
// - Переопределить единственный метод так, чтобы он вызывал внутри себя метод
// предка, но в начале и конце распечатывал информацию о входных и выходных параметрах

package terminal.factories;

import service.StudentServiceImpl;
import terminal.Command;
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
