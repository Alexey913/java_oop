// Семинар 6 - Задача 1
// - Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
// - Реализовать в нем булевские методы для проверки введенных команд
// - Изменить сигнатуру у интерфейса ParseCommand, чтобы он вместо массива строк начал возвращать
// объект класса Command
// - отредактировать класс CommandExecutableFactory, убрав из него хардкод и начав принимать на вход
// объект Command

package terminal;

import java.util.List;

public class Command {

    private static final String ADD = "add";
    private static final String DEL = "delete";
    private static final String NAME = "name";
    private static final String AGEGROUP = "age/group";
    private String action;
    private List <String> args;

    public Command(String action, List<String> args) {
        this.action = action;
        this.args = args;
    }

    public String getFirstArgument() {
        return args.get(0);
    }

    public String getSecondArgument() {
        return args.get(1);
    }

    public Integer getThirdArgument() {
        return Integer.parseInt(args.get(2));
    }

    public Integer getFourthArgument() {
        return Integer.parseInt(args.get(3));
    }

    public boolean isCreateCommand () {
        return this.action.equals(ADD);
    } 

    public boolean isDeleteCommand () {
        return this.action.equals(DEL);
    } 

    public boolean isDelByNameCommand () {
        return (this.action.equals(DEL) && getFirstArgument().equals(NAME));
    }
    
    public boolean isDelByAgeGroupCommand () {
        return (this.action.equals(DEL) && getFirstArgument().equals(AGEGROUP));
    }
    
}