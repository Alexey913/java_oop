/*
Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt
(реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.
*/

package service;

import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {

    @Override
    public StudentGroup read() {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents);
        return studentGroup;
    }

    @Override
    public StudentGroup read (int groupNumber) {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents, groupNumber);
        return studentGroup;
    }

    @Override
    public void create(StudentGroup studentGroup) {
        // Запись группы в текстовый файл
        
    }




}
