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
import terminal.terminalExecute.DeleteStudentExecutable;

public class CommandExecutableFactory {
    private StudentServiceImpl studentServiceImpl;

    public CommandExecutable create (String [] input) {
        if (input[0].equals("add"))
            return new CreateStudentExecutable (studentServiceImpl, new Student(input[1]));
        else return new DeleteStudentExecutable (studentServiceImpl, new Student(input[1]));
    }
}
