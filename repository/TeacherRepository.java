// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream

package repository;

import data.Teacher;

public class TeacherRepository implements UserRepository <Teacher, Integer> {

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByFio(String fio) {
        return null;
    }
    
}
