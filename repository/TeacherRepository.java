package repository;

import data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {

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

    @Override
    public Teacher findByAge(Integer age) {
        return null;
    }

    @Override
    public boolean removeUserByFio(String fio) {
        return true;
    }

    @Override
    public void removeUser(Teacher entity) {
    }
}