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

    @Override
    public CommandExecutable commandForAction(Command input) {
        if (input.isCreateCommandByName())
            return new CreateStudentExecutable(StudentService, new Student(input.getSecondArgumentStr()));
        else if (input.isCreateCommandByNameAgeGroup())
            return new CreateStudentExecutable(StudentService, new Student(input.getSecondArgumentStr(),
                    input.getThirdArgument(), input.getFourthArgument()));
        else if (input.isDelByNameCommand()) {
            return new DelStudentByFioExecutable(StudentService, input.getSecondArgumentStr());
        } else if (input.isDelByAgeGroupCommand()) {
            return new DelStudentByAgeGroupExecutable(StudentService, input.getSecondArgumentInt(),
                    input.getThirdArgument());
        } else
            return new WrongCommand();
    }
}