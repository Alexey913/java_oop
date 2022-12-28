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


package service;

import data.Student;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService {

    private final StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user); 
    }

    public Student SaveStudent(Student entity) {
        return studentRepository.Save(entity);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
    
}
