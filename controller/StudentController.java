// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream

package controller;

import data.Student;
import service.StudentServiceImpl;

public class StudentController implements UserController <Student, Integer> {

    private final StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
 
    @Override
    public Student read(Student entity) {
        return studentServiceImpl.read(entity);
    }

    @Override
    public Student create(Student entity) {
        studentServiceImpl.create(entity);
        studentServiceImpl.read(entity);
        return entity;
    }

    @Override
    public Student save(Student entity) {
        return studentServiceImpl.saveUser(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentServiceImpl.findUserById(id);
    }

    @Override
    public Student findUserByFio(String fio) {
        return studentServiceImpl.findUserByFio(fio);
    }
}
