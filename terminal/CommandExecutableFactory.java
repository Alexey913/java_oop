// Семинар 5. Задача 4.
// - Создать класc CommandExecutableFactory 
// - Реализовать в нём метод CommandExecutable create (String[] input),
// где в зависимости от переданных параметров создается тот или иной класс 
// - Осуществить этот класс и метод в классе TerminalReader




package terminal;

import data.Student;
import service.StudentServiceImpl;
import terminal.terminalExecute.CommandExecutable;
import terminal.terminalExecute.CreateStudentExecutable;
import terminal.terminalExecute.DelStudentByAgeGroupExecutable;
import terminal.terminalExecute.DelStudentByFioExecutable;
import terminal.terminalExecute.DeleteStudentExecutable;

public class CommandExecutableFactory {
    private StudentServiceImpl studentServiceImpl;

    public CommandExecutable commandForAction (String [] input) {
        if (input[0].equals("add"))
            return new CreateStudentExecutable (studentServiceImpl, new Student(input[1]));
        else if (input[0].equals("delete") && input[1].equals("name"))
            return new DelStudentByFioExecutable(input[2]);
        else if (input[0].equals("delete") && input[1].equals("Age-Group"))
            return new DelStudentByAgeGroupExecutable(Integer.parseInt(input[2]), Integer.parseInt(input[3]));
        else return new DeleteStudentExecutable (studentServiceImpl, new Student (input[1]));
    }
}
