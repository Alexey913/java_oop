// Семинар 6 - Задача 3
// - Переименовать класс CommandExecutableFactory в CommandExecutableFactoryImpl
// - Создать интерфейс CommandExecutableFactory и имплементировать от него класс CommandExecutableFactoryImpl.
// - В классе TerminalReader реализовать DIP, то есть возможность менять реализации CommandExecutableFactory

package terminal.factories;

import terminal.command.Command;
import terminal.terminalExecute.CommandExecutable;

public interface CommandExecutableFactory {
    public CommandExecutable commandForAction (Command input);
}