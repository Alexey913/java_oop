// Семинар 5. Задача 3
// - Создать интерфейс CommandExecutable c абстрактным методом execute()
// - Реализовать 2 класса, имплементировав созданный интерфейс,
// CreateStudentExecutable и DeleteStudentExecutable.
// В унаследованных методах они должны обращаться к методом класса StudentService.
// - Подумать какие переменные могли бы содержать созданные классы

package terminal.terminalExecute;

import data.Student;
import service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.saveUser(student);
    }
}
