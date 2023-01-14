// Семинар 5. Задача 3
// - Создать интерфейс CommandExecutable c абстрактным методом execute()
// - Реализовать 2 класса, имплементировав созданный интерфейс,
// CreateStudentExecutable и DeleteStudentExecutable.
// В унаследованных методах они должны обращаться к методом класса StudentService.
// - Подумать какие переменные могли бы содержать созданные классы

package terminal.terminalExecute;

import data.Student;
import service.StudentServiceImpl;

public class DeleteStudentExecutable implements CommandExecutable {

    private StudentServiceImpl studentServiceImpl;
    private Student student;
    
    public DeleteStudentExecutable(StudentServiceImpl studentServiceImpl, Student student) {
        this.studentServiceImpl = studentServiceImpl;
        this.student = student;
    }

    @Override
    public void execute() {
        studentServiceImpl.removeUser(student);
    }
}
