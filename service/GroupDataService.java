//Создать класс StudentGroupServiceImpl,
// в котором реализована логика чтения Студентов и Преподавателя из файла txt
// (реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.

package service;

import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;


//Создаем новый интерфейс для компановки группы
public interface GroupDataService {
    

    
    Teacher readTeacher(User user);
    List <Student> readStudents (List <Student> listOfStudents, User user);
    StudentGroup newGroup(List <Student> listOfStudents, Teacher teacher, int groupNumber);
}