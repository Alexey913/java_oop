package service;

import data.Student;

public interface StudentService extends DataService<Student> {
    void removeUserByGroup(int number);
}