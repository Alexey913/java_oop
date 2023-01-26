// Семинар 5. Задача 3
// - Создать интерфейс CommandExecutable c абстрактным методом execute()
// - Реализовать 2 класса, имплементировав созданный интерфейс,
// CreateStudentExecutable и DeleteStudentExecutable.
// В унаследованных методах они должны обращаться к методом класса StudentService.
// - Подумать какие переменные могли бы содержать созданные классы

package terminal.terminalExecute;

import data.Student;
import service.StudentService;
import terminal.CommandResult;

public class CreateStudentExecutable extends AbstractCommandExecutable{
    private static final String DESCRIPTION = "Команда СОЗДАНИЕ СТУДЕНТА ";

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public CommandResult execute() {
        studentService.saveUser(student);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + student.toString() + " ";
    }
}
