package service;

import data.Student;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements StudentService {

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

    @Override
    public Student findUserByAge(int age) {
        return studentRepository.findByAge(age);
    }

    @Override
    public boolean removeUserByFio(String fio) {
        return studentRepository.removeUserByFio(fio);
    }

    @Override
    public void removeUser(Student user) {
    }

    @Override
    public void removeUserByGroup(int number) {
    }
}