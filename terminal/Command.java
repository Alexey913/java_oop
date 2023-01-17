// Семинар 6. Задача 1.
// - Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
// - Реализовать в нем булевские методы для проверки введенных команд
// - отредактировать класс CommandExecutableFactory, убрав из него хардкод и начав принимать на вход объект Command после ДЗ

package terminal;

import java.util.List;

public class Command {
    private static final String ADD = "add";
    private static final String DEL = "delete";
   
    private String action;
    private List <String> args;

    public String getArgs() {
        return args.get(0);
    }
    public boolean createCommand() {
        return action.equals(ADD);
    }
    public boolean deleteCommand() {
        return action.equals(DEL);
    }
}
