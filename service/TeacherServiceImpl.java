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
// import util.ReaderFromTxt;
// import util.WriterToTxt;

// public class TeacherServiceImpl implements DataService {
    
//     @Override
//     public void create(User user) {
//         WriterToTxt.write(user);
//     }

//     @Override
//     public User read(User user) {
//         ReaderFromTxt.read(user);
//         return user;
//     }
    
// }


// Для Д/З Семинар 4
package service;

import data.Teacher;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService <Teacher> {

    private final TeacherRepository teacherRepository;
    
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(Teacher entity) {
        WriterToTxt.write(entity);
    }

    @Override
    public Teacher read(Teacher entity) {
        ReaderFromTxt.read(entity);
        return entity;
    }

    @Override
    public Teacher saveUser(Teacher entity) {
        return teacherRepository.save(entity);
    }

    @Override
    public Teacher findUserById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findUserByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }
    
}
