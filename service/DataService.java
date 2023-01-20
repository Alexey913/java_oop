// Семинар 2 - Задача 1.3
// Создать интерфейс DataService, описывающий реализацию конкретных
// сервисов по управлению сущностями (create, read).
// Создать для сущности Student отдельный Service,
// реализующий интерфейс DataService.
// Create и read операции реализуются путем вызова utils методов


// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream



// Для всех задач, кроме Д/З Семинар 4

// package service;

// import data.User;
// public interface DataService {
    
//     void create(User user);
//     User read(User user);
// }

// Для Д/З Семинар 4
package service;

import data.User;
public interface DataService <U extends User> {
    
    void create(U entity);
    U read(U entity);
    U saveUser(U entity);
    U findUserById(int id);
    U findUserByFio(String fio);
    U findUserByAge (int age);
    void removeUserByFio (String fio);
    void removeUser (U user);
}
