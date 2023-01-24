// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream

package controller;

import data.User;

public interface UserController <E extends User, I> extends Controller <E, I> {
    E read(E entity);
    E create(E entity);
    E findUserByFio(String fio);
}