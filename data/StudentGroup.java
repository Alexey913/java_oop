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


package data;

import java.util.Iterator;
import java.util.List;

import data.iterator.StudentGroupIterator;


public class StudentGroup implements Iterable <Student> {
    
// К Д/З Семинар 2
    private Teacher teacher;
    private List <Student> listOfStudents;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List<Student> listOfStudents) {
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
    }

    public StudentGroup(Teacher teacher, List<Student> listOfStudents, int groupNumber) {
        this(teacher, listOfStudents);
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
   
    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

// К Семинару 3 - Задача 2
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
