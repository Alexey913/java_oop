package repository;

/*
 - Создать класc StudentRepository имплементировав интерфейс UserRepository <Student, Integer>
- В классе StudentService добавить новую переменную StudentRepository 
- В классе StudentService  реализовать методы сохранения студента и его поиска по id и ФИО.
 */


import data.Student;
import data.StudentGroup;

public class StudentRepository implements UserRepository <Student, Integer>{

    @Override
    public StudentGroup save(Student entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        // TODO Auto-generated method stub
        return null;
    }

    public static StudentGroup saveGroup(StudentGroup studentGroup) {
        return null;
    }
    
}
