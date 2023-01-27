package repository;

import data.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {

    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
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
    public boolean removeUserByFio(String fio) {
        return this.studentTable.removeUserByFio(fio);
    }

    @Override
    public void removeUser(Student user) {
    }
}