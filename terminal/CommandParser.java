// Семинар 5. Задача 1
// - Создать пекедж terminal. Дальнейшие работы ведем в нем
// - Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand)
// - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
// который в бесконечном цикле слушает команды с помощью Scanner(System.in)

// Семинар 6 - Задача 1
// - Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
// - Реализовать в нем булевские методы для проверки введенных команд
// - Изменить сигнатуру у интерфейса ParseCommand, чтобы он вместо массива строк начал возвращать
// объект класса Command
// - отредактировать класс CommandExecutableFactory, убрав из него хардкод и начав принимать на вход
// объект Command

package terminal;

//Для семинара 5
// public interface CommandParser {
//     String[] parseCommand (String inputCommand);
// }

//Для семинара 6
public interface CommandParser {
    Command parseCommand (String inputCommand);
}
