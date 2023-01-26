// Семинар 4 - Задача 3
// - Создать интерфейс UserRepository<E  extends User,I> унаследовав его от Repository<E, I>
// - В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)
// - Создать класc StudentRepository имплементировав интерфейс UserRepository

// Семинар 4 - Задача 4
// - Создать класc StudentRepository имплементировав интерфейс UserRepository <Student, Integer>
// - В классе StudentService добавить новую переменную StudentRepository 
// - В классе StudentService  реализовать методы сохранения студента и его поиска по id и ФИО.


package repository;

import data.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {

    private final StudentTable studentTable;
    
    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }

    @Override
    public Student save(Student entity) {
        this.studentTable.save(entity);
        return entity;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

    @Override
    public Student findByAge(Integer age) {
        return null;
    }

    @Override
    public void removeUserByFio(Student entity) {
        this.studentTable.removeUserByFio(entity.getFio());
    }

    @Override
    public void removeUser(Student user) {
        
    }
}
