// Семинар 5. Задача 1
// - Создать пекедж terminal. Дальнейшие работы ведем в нем
// - Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand)
// - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
// который в бесконечном цикле слушает команды с помощью Scanner(System.in)

// Семинар 5. Задача 2
// - Сделать класс TerminalReader синглтоном

// Семинар 5. Задача 4.
// - Создать класc CommandExecutableFactory 
// - Реализовать в нём метод CommandExecutable create (String[] input),
// где в зависимости от переданных параметров создается тот или иной класс 
// - Осуществить этот класс и метод в классе TerminalReader


// ДЗ - Семинар 5
// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды


package terminal;

import java.util.Scanner;

import service.StudentServiceImpl;
import terminal.factories.CommandExecutableFactory;
import terminal.terminalExecute.CommandExecutable;

public class TerminalReader {
    
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    
    private static TerminalReader terminalReader;

    private TerminalReader(StudentServiceImpl studentServiceImpl, CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public static TerminalReader getInstance(StudentServiceImpl studentServiceImpl, CommandParser commandParser,
    CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(studentServiceImpl, commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    public void scanner () {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            Command parseCommand = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.commandForAction(parseCommand);
            commandExecutable.execute();
        }
    }
}