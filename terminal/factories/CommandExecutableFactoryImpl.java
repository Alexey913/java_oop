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


package terminal.factories;

import data.Student;
import service.StudentService;
import terminal.command.Command;
import terminal.terminalExecute.CommandExecutable;
import terminal.terminalExecute.CreateStudentExecutable;
import terminal.terminalExecute.DelStudentByAgeGroupExecutable;
import terminal.terminalExecute.DelStudentByFioExecutable;
import terminal.terminalExecute.WrongCommand;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private StudentService StudentService;

    public CommandExecutableFactoryImpl(StudentService StudentService) {
        this.StudentService = StudentService;
    }

// К семинару 5
//     public CommandExecutable commandForAction (String [] input) {
//         if (input[0].equals("add"))
//             return new CreateStudentExecutable (StudentService, new Student(input[1]));
//         else if (input[0].equals("delete") && input[1].equals("name"))
//             return new DelStudentByFioExecutable(input[2], StudentService);
//         else if (input[0].equals("delete") && input[1].equals("Age-Group"))
//             return new DelStudentByAgeGroupExecutable(Integer.parseInt(input[2]), Integer.parseInt(input[3]), StudentService);
//         else return new DeleteStudentExecutable (StudentService, new Student (input[1]));
//     }
// }


// К семинару 6
    @Override
    public CommandExecutable commandForAction (Command input) {
            if (input.isCreateCommandByName())
                return new CreateStudentExecutable (StudentService, new Student(input.getSecondArgumentStr()));
            else if (input.isCreateCommandByNameAgeGroup())
                return new CreateStudentExecutable (StudentService, new Student(input.getSecondArgumentStr(),
                                                    input.getThirdArgument(), input.getFourthArgument()));
            else if (input.isDelByNameCommand()) {
                return new DelStudentByFioExecutable(StudentService, input.getSecondArgumentStr());
            }
            else if (input.isDelByAgeGroupCommand()) {
                return new DelStudentByAgeGroupExecutable(StudentService, input.getSecondArgumentInt(), input.getThirdArgument());
            }
            else return new WrongCommand ();
    }
}