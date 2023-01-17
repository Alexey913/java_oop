// Семинар 6. Задача 2.

// - Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactory 
// - Переопределить единственный метод так, чтобы он вызывал внутри себя метод предка,
// но в начале и конце распечатывал информацию о входных и выходных параметрах


package terminal;

import service.StudentServiceImpl;
import terminal.terminalExecute.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactory(StudentServiceImpl studentServiceImpl) {
        super(studentServiceImpl);
    }

    @Override
    public CommandExecutable create (String [] input) {
        System.out.println("Input data");
        CommandExecutable result = super.create(input);
        System.out.println("Output data or loging");
        return result;
    }
}
