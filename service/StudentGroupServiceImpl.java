// Д/З Семинар 2
// Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt
// (реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.

package service;

import java.util.Collections;
import java.util.Iterator;
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

// Семинар 3
// Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО

    @Override
    public void removeStudent(String fio) {
        Iterator <Student> studentGroup = read().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }
    }


// Семинар 3
// Модифицировать класс Controller, добавив в него метод сорторовки 
// списка студентов и вызвать в нем созданный метод из StudentGroupServiceImpl


    @Override
    public void sortYear(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getListOfStudents());
    }

// Семинар 3
// Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студетнов по ФИО

    @Override
    public void sortToFio(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getListOfStudents(), new UserComparator());
        
    }


}
