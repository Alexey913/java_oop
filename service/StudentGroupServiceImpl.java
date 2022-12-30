// Д/З Семинар 2
// 1. Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
// 2. Создать класс StudentGroupServiceImpl, в котором реализована
// логика чтения Студентов и Преподавателя из файла txt (реализация чтения файла опциональна),
// создания класса StudentGroup и возвращения его.
// 3. Создать метод в Controller createGroup(int groupNumber),
// в который передается номер группы, а возвращается StudentGroup.
// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.


// Семинар 3 - Задача 2
// 1. Модифицировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
// 2. Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО
// 4. Модифицировать класс Controller, добавив в него метод удаления студента
// и вызывать в нем созданный метод из StudentGroupServiceImpl


// Семинар 3 - задача 3
// 1. Модифицировать класс Student, заставив его реализовать интерфейс Comparable
// 2. Реализовать контракт compareTo () со сравнением по году рождения студента
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// и вызывать в нем созданный метод из StudentGroupServiceImpl


// Семинар 3 - Задача 4
// 1. Создать класс UserComparator реализующий интерфейс Comparator<User>
// 2. Реализовать контракт compareTo() со сравнением по ФИО
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов по ФИО
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// по ФИО и вызывать в нем созданный метод из StudentGroupServiceImpl


// Семинар 4 - Задача 2
// - Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
// - В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
// - В классе StudentGroupServiceImpl реализовать методы сохранения группы и поиска её по номеру 


package service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.comparator.UserComparator;
import repository.Repository;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {

// К Семинару 4 - Задача 2
    private final Repository <StudentGroup, Integer> studentGroupRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
    }

    // К Д/З Семинар 2
    @Override
    public StudentGroup read() {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents);
        return studentGroup;
    }

    public StudentGroup read (int groupNumber) {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents, groupNumber);
        return studentGroup;
    }

    @Override
    public StudentGroup create(StudentGroup studentGroup) {
        // Запись группы в текстовый файл
        return studentGroup;
    }

// К Семинару 3 - Задача 2
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

// К Семинару 3 - Задача 3
    @Override
    public void sortByYear(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getListOfStudents());
    }

// К Семинару 3 - Задача 4
    @Override
    public void sortByFio(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getListOfStudents(), new UserComparator());
    }

// К Семинару 4 - Задача 2
    @Override
    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupRepository.save(studentGroup);
    }

    @Override
    public StudentGroup findGroup(Integer groupNumber) {
        return studentGroupRepository.findById(groupNumber);
    }
}