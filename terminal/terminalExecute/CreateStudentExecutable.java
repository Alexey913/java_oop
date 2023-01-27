package terminal.terminalExecute;

import data.Student;
import service.StudentService;
import terminal.command.show.CommandStatus;

public class CreateStudentExecutable extends AbstractExecutable {
    private static final String COMMENT = "Команда СОЗДАНИЕ СТУДЕНТА ";

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public CommandStatus execute() {
        studentService.saveUser(student);
        return createResult(true);
    }

    @Override
    protected String getComment() {
        return COMMENT + student.toString() + " ";
    }
}