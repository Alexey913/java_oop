// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream

package controller;

import data.Teacher;
import service.TeacherServiceImpl;

public class TeacherController implements UserController <Teacher, Integer> {

    private final TeacherServiceImpl teacherServiceImpl;

    public TeacherController(TeacherServiceImpl teacherServiceImpl) {
        this.teacherServiceImpl = teacherServiceImpl;
    }
 
    @Override
    public Teacher read(Teacher entity) {
        return teacherServiceImpl.read(entity);
    }

    public Teacher create(Teacher entity) {
        teacherServiceImpl.create(entity);
        teacherServiceImpl.read(entity);
        return entity;
    }

    @Override
    public Teacher save(Teacher entity) {
        return teacherServiceImpl.saveUser(entity);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherServiceImpl.findUserById(id);
    }

    @Override
    public Teacher findUserByFio(String fio) {
        return teacherServiceImpl.findUserByFio(fio);
    }
}
