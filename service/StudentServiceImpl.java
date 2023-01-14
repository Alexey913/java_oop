// Семинар 2 - Задача 1.3
// Создать интерфейс DataService, описывающий реализацию конкретных
// сервисов по управлению сущностями (create, read).
// Создать для сущности Student отдельный Service,
// реализующий интерфейс DataService.
// Create и read операции реализуются путем вызова utils методов\


// Семинар 4 - Задача 4
// - Создать класc StudentRepository имплементировав интерфейс UserRepository <Student, Integer>
// - В классе StudentService добавить новую переменную StudentRepository 
// - В классе StudentService реализовать методы сохранения студента и его поиска по id и ФИО.


// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream


// Для всех задач, кроме Д/З Семинар 4
// package service;

// import data.Student;
// import data.User;
// import repository.StudentRepository;
// import util.ReaderFromTxt;
// import util.WriterToTxt;

// public class StudentServiceImpl implements DataService<Student> {

//     private final StudentRepository studentRepository;
    
//     public StudentServiceImpl(StudentRepository studentRepository) {
//         this.studentRepository = studentRepository;
//     }

//     @Override
//     public void create(Student user) {
//         WriterToTxt.write(user);
//     }

//     @Override
//     public Student read(Student user) {
//         return ReaderFromTxt.read(user); 
//     }

//     @Override
//     public Student SaveStudent(Student entity) {
//         return studentRepository.Save(entity);
//     }

//     public Student findStudentById(int id) {
//         return studentRepository.findById(id);
//     }

//     public Student findStudentByFio(String fio) {
//         return studentRepository.findByFio(fio);
//     }
    
// }

// Для Д/З Семинар 4
package service;

import data.Student;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService<Student> {

    private final StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(Student entity) {
        WriterToTxt.write(entity);
    }

    @Override
    public Student read(Student entity) {
        return ReaderFromTxt.read(entity); 
    }

    @Override
    public Student saveUser(Student entity) {
        return studentRepository.save(entity);
    }

    @Override
    public Student findUserById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findUserByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
    
    public void removeUser(Student student) {
    }
}