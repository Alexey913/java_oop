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

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entity) {
        return null;
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
}
