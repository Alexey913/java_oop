// Семинар 5. Задача 1
// - Создать пекедж terminal. Дальнейшие работы ведем в нем
// - Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand)
// - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
// который в бесконечном цикле слушает команды с помощью Scanner(System.in)

// Семинар 5. Задача 2
// - Сделать класс TerminalReader синглтоном


package terminal;

import java.util.Scanner;

import service.StudentServiceImpl;
import terminal.terminalExecute.CommandExecutable;

public class TerminalReader {
    private CommandParser commandParser;
    private static TerminalReader terminalReader;
    private StudentServiceImpl studentServiceImpl;
    private CommandExecutableFactory commandExecutableFactory;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void scanner () {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            String [] parseCommand = commandParser.parseCommand(command);
            CommandExecutableFactoryImpl commandExecutableFactory = new CommandExecutableFactoryImpl(studentServiceImpl);
            CommandExecutable commandExecutable = commandExecutableFactory.create(parseCommand);
            commandExecutable.execute();
            sc.close();
        }
    }
}
