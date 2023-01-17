// Семинар 5. Задача 1
// - Создать пекедж terminal. Дальнейшие работы ведем в нем
// - Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand)
// - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
// который в бесконечном цикле слушает команды с помощью Scanner(System.in)


package terminal;

public interface CommandParser {
    //Для семинара 5
    String[] parseCommand (String inputCommand);
    
    //Для семинара 6
    // Command parseCommand (String inputCommand);
}
