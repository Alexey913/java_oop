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
import service.StudentServiceImpl;
import terminal.Command;
import terminal.terminalExecute.CommandExecutable;
import terminal.terminalExecute.CreateStudentExecutable;
import terminal.terminalExecute.DelStudentByAgeGroupExecutable;
import terminal.terminalExecute.DelStudentByFioExecutable;
import terminal.terminalExecute.DeleteStudentExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private StudentServiceImpl studentServiceImpl;

    public CommandExecutableFactoryImpl(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

// К семинару 5
//     public CommandExecutable commandForAction (String [] input) {
//         if (input[0].equals("add"))
//             return new CreateStudentExecutable (studentServiceImpl, new Student(input[1]));
//         else if (input[0].equals("delete") && input[1].equals("name"))
//             return new DelStudentByFioExecutable(input[2], studentServiceImpl);
//         else if (input[0].equals("delete") && input[1].equals("Age-Group"))
//             return new DelStudentByAgeGroupExecutable(Integer.parseInt(input[2]), Integer.parseInt(input[3]), studentServiceImpl);
//         else return new DeleteStudentExecutable (studentServiceImpl, new Student (input[1]));
//     }
// }


// К семинару 6
    @Override
    public CommandExecutable commandForAction (Command input) {
        if (input.isCreateCommand())
            return new CreateStudentExecutable (studentServiceImpl, new Student(input.getFirstArgument()));
        else if (input.isDelByNameCommand()) {
            return new DelStudentByFioExecutable(studentServiceImpl, input.getSecondArgument());
        }
        else if (input.isDelByAgeGroupCommand()) {
            return new DelStudentByAgeGroupExecutable(studentServiceImpl, input.getThirdArgument(), input.getFourthArgument());
        }
        else return new DeleteStudentExecutable (studentServiceImpl, new Student (input.getFirstArgument()));
    }
}